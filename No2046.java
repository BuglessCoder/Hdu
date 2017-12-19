package hdu;

import java.util.Scanner;

public class No2046 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			int n = scanner.nextInt();
			if(n>0&&n<=50){
				long[] a = new long[50];
				a[0] = 1;
				a[1] = 2;
				if(n>2){
					for(int i=2;i<n;i++){
						a[i] = a[i-1]+a[i-2];
					}
				}
				System.out.println(a[n-1]);
			}
		}

	}

}
