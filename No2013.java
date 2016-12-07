package hdu;

import java.util.Scanner;

public class No2013 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int sum = 1;
			for(int i=0;i<n-1;i++){
				sum=(sum+1)*2;
			}
			System.out.println(sum);		
		}
	}
}
