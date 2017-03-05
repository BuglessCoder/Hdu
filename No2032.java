package hdu;

import java.util.Scanner;

public class No2032 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				for(int j=0;j<=i;j++){
					System.out.print(f(i,j) + " ");
				}
				System.out.println();
			}
		}
	}
	
	
	
	public static int f(int m, int n){
		if(n == 0 || n == m){
			return 1;
		}
		return f(m-1,n) + f(m-1,n-1);
	}
}
