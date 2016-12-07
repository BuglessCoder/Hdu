package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No2014 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("######0.00"); 
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n-2];
			for(int i=0;i<n;i++){
				int input = sc.nextInt();
				a[i] = input;
			}
			int max = a[0];
			int min = a[0];
			int f1 = 0;
			int f2 = 0;
			for(int i=1;i<n;i++){
				if(a[i]>max){
					max = a[i];
					f1 = i;
				}
				if(a[i]<min){
					min = a[i];
					f2 = i;
				}
			}
			if(f1>f2){
				int temp = f1;
				f1 = f2;
				f2 = temp;
			}
			for(int i=0;i<f1;i++){
				b[i] = a[i];
			}
			for(int i=f1+1;i<f2;i++){
				b[i-1] = a[i];
			}
			for(int i=f2+1;i<n;i++){
				b[i-2] = a[i];
			}
			double sum = 0;
			for(int i=0;i<n-2;i++){
				sum+=b[i];
			}	
			System.out.println(df.format(sum/(n-2)));
				
		}

	}

}
