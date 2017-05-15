package hdu;

import java.util.Scanner;

public class No2042 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	
		for(int i=0;i<n;i++){
			int count = 3;
			int a = scanner.nextInt();
			for(int j=0;j<a;j++){
				count=(count-1)*2;
			}
			System.out.println(count);
		}

	}

}
