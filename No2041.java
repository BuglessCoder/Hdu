package hdu;

import java.util.Scanner;

public class No2041 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0;i<n;i++){
			int m = scanner.nextInt();
			int[] a = new int[42];
			a[2] = 1;
			a[3] = 2;
			for(int j=4;j<=m;j++){
				a[j] = a[j-1] + a[j-2];		//递归
			}
			System.out.println(a[m]);
		}

	}

}
