package hdu;

import java.util.Scanner;

public class No2007 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum1 = 0;
			int sum2 = 0;
			if(a>b){
				int t;
				t = a;
				a = b;
				b = t;
			}
			for(int i=a;i<=b;i++){
				if(i%2 == 0){
					sum1+=(i*i);
				}
				else{
					sum2+=(i*i*i);
				}
			}
			System.out.println(sum1 + " " + sum2);
		}	
	}
}
