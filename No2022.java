package hdu;

import java.util.Scanner;

public class No2022 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			long[][] input = new long[m][n]; 
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					input[i][j] = sc.nextInt();
				}
			}
			int p = 0;
			int q = 0;
			long max = input[0][0];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(Math.abs(max)<Math.abs(input[i][j])){
						p = i;
						q = j;
						max = input[i][j];
					}
				}
			}
			System.out.println((p+1) + " " + (q+1) + " " + max);
		}

	}

}
