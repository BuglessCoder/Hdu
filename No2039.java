package hdu;

import java.util.Scanner;

public class No2039 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double a,b,c;
		for(int i=0;i<n;i++){
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			c = scanner.nextDouble();
			if(a+b>c && a+c>b && b+c>a){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}

	}

}
