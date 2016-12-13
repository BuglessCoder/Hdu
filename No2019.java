package hdu;

import java.util.Scanner;

public class No2019 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n+1];
			if(n==0 && m==0){
				System.exit(0);
			}
			else{
				int flag = 0;
				for(int i=0;i<n;i++){
					a[i] = sc.nextInt();
				}
				for(int i=0;i<n;i++){
					if(m<a[i]){
						flag = i;
						break;
					}
				}
				for(int i=0;i<flag;i++){
					b[i] = a[i];
				}
				b[flag] = m;
				for(int i=flag+1;i<=n;i++){
					b[i] = a[i-1];
				}
				for(int j=0;j<=n;j++){
					if(j==n){
						System.out.println(b[j]);
					}
					else{
						System.out.print(b[j] + " ");
					}
				}
				
			}			
		}

	}

}
