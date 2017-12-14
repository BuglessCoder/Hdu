package hdu;

import java.util.Scanner;

public class No2045 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			int n = scanner.nextInt();
			if(n>0 && n<=50){
				long[] a = new long[n];
				if(n == 1){
					a[0]=3;
				}
				else if(n == 2){
					a[1]=6;
				}
				else if(n == 3){
					a[2]=6;
				}
				else{
					a[0]=3;
					a[1]=6;
					a[2]=6;
					for(int i=3;i<n;i++){
						a[i] = a[i-1]+2*a[i-2];
					}
				}
				System.out.println(a[n-1]);
			}
		}
	}
}
