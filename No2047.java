package hdu;

import java.util.Scanner;

public class No2047 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			int n = scanner.nextInt();
			if(n>0 && n<40){
				long a[] = new long[39];
				//n=1 a[0] = 3;
				//n=2 a[1] = 2*3+1*2=8;
				//n=3 a[2] = (8-2)*3+2*2=22;
				//n=4 a[3] = (22-6)*3+6*2=60;
				//n=5 a[4] = (60-16)*3+16*2=164;
				//f(n)=2*2*f(n-2)+2*2*f(n-1)=4*(f(n-2)+f(n-1))
				a[0] = 3;
				a[1] = 8;
				if(n>=3){
					for(int i=2;i<n;i++){
						a[i] = 2*(a[i-2]+a[i-1]);
					}
				}
				System.out.println(a[n-1]);
			}
		}
	}
}
