package hdu;

import java.util.Scanner;

public class No2040 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		for(int i=0;i<m;i++){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int sum1 = 0;
			int sum2 = 0;
			for(int j=1;j<a;j++){
				if(a%j == 0){
					sum1+=j;
				}
			}
			for(int h=1;h<b;h++){
				if(b%h == 0){
					sum2+=h;
				}
			}
			if(sum1 == b && sum2 == a){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}

	}

}
