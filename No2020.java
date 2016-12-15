package hdu;

import java.util.Scanner;

public class No2020 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			if(n==0){
				System.exit(0);
			}
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(Math.abs(a[i])<Math.abs(a[j])){
						int temp = a[j];
						a[j] = a[i];
						a[i] = temp;
					}
				}
			}
			for(int i=0;i<n;i++){
				if(i==n-1){
					System.out.println(a[i]);
				}
				else{
					System.out.print(a[i] + " ");
				}
				
			}
			
		}
	}

}
