package hdu;

import java.util.Scanner;

public class No2036 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner =new Scanner(System.in);
		while(true){
			int n = scanner.nextInt();
			int i;
			int[] a = new int[n];
			int[] b = new int[n];
			double sum = 0;
			if(n==0){
				break;
			}
			for(i=0;i<n;i++){
				a[i] = scanner.nextInt();
				b[i] = scanner.nextInt();
			}
			for(i=0;i<n-1;i++){
				sum+=a[i]*b[i+1]-a[i+1]*b[i];
			}
			sum+=a[i]*b[0]-a[0]*b[i];
			System.out.println(sum/2);
			
			
			
		}

	}

}
