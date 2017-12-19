package hdu;

import java.util.Scanner;

public class No2048 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0;i<n;i++){
			int m = scanner.nextInt();
			double a[] = new double[19];
			if(m>1 && m<=20){
				a[0] = 1;	//m=2
				a[1] = 2;	//m=3
				double ji = 1;
				if(m>=4){
					for(int j=2;j<m-1;j++){
						a[j] = (j+1)*(a[j-1]+a[j-2]);						
					}
				}
				for(int h=2;h<=m;h++){
					ji*=h;
				}			
				double d = (100*a[m-2])/ji;
				System.out.println(String.format("%.2f",d)+"%");
			}
		}	
	}
}
