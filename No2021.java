package hdu;

import java.util.Scanner;

public class No2021 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNextInt()){
			 int n = sc.nextInt();
			 if(n==0){
				 System.exit(0);
			 }
			 int a[] = new int [n];
			 int sum = 0;
			 int remain=0;
			 int i=0;
			 for(i=0;i<n;i++){
				 a[i]=sc.nextInt();
				 sum += a[i]/100;
				 remain = a[i]%100;
				 sum+=remain/50;
				 remain%=50;
				 sum+=remain/10;
				 remain%=10;
				 sum+=remain/5;
				 remain%=5;
				 sum+=remain/2;
				 remain%=2;
				 sum+=remain;
			 }
			 System.out.println(sum);
		 }
		 
	}

}
