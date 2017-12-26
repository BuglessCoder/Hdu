package hdu;

import java.util.Scanner;

public class No2050 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		for(int i=0;i<c;i++){
			int n = scanner.nextInt();
			if(n>0 && n<=10000){
				int a[] = new int[10001];
				a[1] = 2;	//n=1
				if(n>1){
					for(int j=2;j<=n;j++){
						/*
						 * 分割平面的个数=交点个数+顶点个数+1
						 * 			   =原有平面数+新增平面数
						 * 			   =原有平面数+新增交点数+新增顶点数
						 * 即f(n)=f(n-1)+2*2*(n-1)+1
						 * 		 =f(n-1)+4*n-3
						 */
						a[j] = a[j-1] + 4*j-3;
					}
				}
				System.out.println(a[n]);
			}
		}
		
	}

}
