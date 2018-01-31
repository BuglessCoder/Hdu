package hdu;

import java.util.Scanner;

public class No2052 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			if(m>0 && m<75 && n>0 &&n<75){
				System.out.print("+");
				for(int i=0;i<m;i++){
					System.out.print("-");
				}
				System.out.println("+");
				for(int i=0;i<n;i++){
					System.out.print("|");
					for(int j=0;j<m;j++){
						System.out.print(" ");
					}
					System.out.println("|");
				}
				System.out.print("+");
				for(int i=0;i<m;i++){
					System.out.print("-");
				}
				System.out.println("+");
			}
			System.out.println();
		}
	}
}
