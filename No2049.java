package hdu;

import java.util.Scanner;

public class No2049 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		for(int i=0;i<c;i++){
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if(m>1 && n>=m && n<=20){
				long a[] = new long[19];
				a[0] = 1;	//m=2
				a[1] = 2;	//m=3
				long xuan = 1;
				if(m>=4){
					for(int j=2;j<m-1;j++){
						a[j] = (j+1)*(a[j-1]+a[j-2]);						
					}
				}
				if(n>m){
			 		long njie = 1;
					long mjie = 1;
					long nmjie = 1;
					for(int k=1;k<=m;k++){
						mjie*=k;
					}
					for(int k=1;k<=n;k++){
						njie*=k;
					}
					for(int k=1;k<=(n-m);k++){
						nmjie*=k;
					}
					xuan = njie/(mjie*nmjie);				
				}
				System.out.println(xuan*a[m-2]);				
			}
		}
	}
}
