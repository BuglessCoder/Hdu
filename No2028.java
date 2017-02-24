package hdu;

import java.util.Scanner;

public class No2028 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			long x = 1;
			long y = 1;
			for(int i=0;i<n;i++){
				if(i == 0){
					x = sc.nextLong();
					y = x;
				}
				else{
					y = sc.nextLong();
					x = lcm(x,y);
				}
			}
			System.out.println(x);
			
			
		}

	}
	
	public static long gcd(long a, long b){		//最大公因数
		if(a<b){
			long t = a;
			a = b;
			b = t;
		}
		long k = b;
		while(a%b!=0){
			k = a%b;
			a = b;
			b = k;
		}
		return k;
	}
	
	public static long lcm(long a, long b){		//最小公倍数
		return (a*b) / gcd(a,b);

	}

}
