package hdu;

import java.util.Scanner;

public class No2051 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			int n = scanner.nextInt();
			System.out.println(Integer.toBinaryString(n));
		}
	}
}
