package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No2023 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			DecimalFormat df = new DecimalFormat("######0.00"); 
			double[] avgN = new double[m];
			double[] avgM = new double[n];
			int[][] a = new int[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					a[i][j] = sc.nextInt();
				}
			}
			double sumN = 0;
			double sumM = 0;
			for(int i=0;i<m;i++){
				sumN = 0;
				for(int j=0;j<n;j++){
					sumN+=a[i][j];
				}
				avgN[i] = (double)sumN/n;
			}
			for(int j=0;j<n;j++){
				sumM = 0;
				for(int i=0;i<m;i++){
					sumM+=a[i][j];
				}
				avgM[j] = (double)sumM/m;
			}
			for(int i=0;i<m;i++){
				if(i!=m-1){
					System.out.print(df.format(avgN[i]) + " ");
				}
				else{
					System.out.print(df.format(avgN[i]));
				}
			}
			System.out.println();
			for(int j=0;j<n;j++){
				if(j!=n-1){
					System.out.print(df.format(avgM[j]) + " ");
				}
				else{
					System.out.print(df.format(avgM[j]));
				}
				
			}
			System.out.println();
			int sum = 0;
			int count = 0;
			for(int i=0;i<m;i++){
				sum = 0;
				for(int j=0;j<n;j++){
					if(a[i][j]>avgM[j]){
						sum++;
					}
				}
				if(sum == n){
					count++;
				}
			}
			System.out.println(count);
			System.out.println();
		}
	}

}
