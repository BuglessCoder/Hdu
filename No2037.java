package hdu;

import java.util.Scanner;

public class No2037 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			if(n == 0){
				break;
			}
			else{
				int[][] a = new int[2][n];
				for(int i=0;i<n;i++){
					a[0][i] = scanner.nextInt();
					a[1][i] = scanner.nextInt();
				}
				for(int i=0;i<n-1;i++){
					for(int j=i+1;j<n;j++){
						if(a[1][i]>a[1][j]){
							
							int temp0 = a[0][i];
							a[0][i] = a[0][j];
							a[0][j] = temp0;
							
							int temp1 = a[1][i];
							a[1][i] = a[1][j];
							a[1][j] = temp1;
							
						}
					}
				}
				int x = a[1][0];
				int count = 1;
				for(int i=1;i<n;i++){
					if(a[0][i]>=x){
						count++;
						x = a[1][i];
					}
				}
				System.out.println(count);
			}
		}

	}

}
