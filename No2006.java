package hdu;

import java.util.Scanner;

public class No2006 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int result = 1;
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				int input = sc.nextInt();
				if(input%2 == 1){
					result*=input;
				}
			}
			System.out.println(result);
		}
	}
}
