package hdu;

import java.util.Scanner;

public class No2023 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			double[] avgN = new double[n];	//n个学生的平均成绩（每行的平均）
			double[] avgM = new double[m];	//m门课程的平均成绩（每列的平均）
			int[][] a = new int[n][m];
			double sumN = 0;
			double sumM = 0;
			for(int i=0;i<n;i++){
				sumN = 0;
				for(int j=0;j<m;j++){
					a[i][j] = sc.nextInt();
					sumN+=a[i][j];
				} 
				avgN[i] = (double)sumN/m;
			}

			for(int j=0;j<m;j++){
				sumM = 0;
				for(int i=0;i<n;i++){
					sumM+=a[i][j];
				}
				avgM[j] = (double)sumM/n;
			}
			
			//输出
			for(int i=0;i<n;i++){
				if(i!=n-1){
					System.out.printf("%.2f ",avgN[i]);
				}
				else{
					System.out.printf("%.2f",avgN[i]);
					System.out.println();
				}
			}
			
			for(int j=0;j<m;j++){
				if(j!=m-1){
					System.out.printf("%.2f ",avgM[j]);
				}
				else{
					System.out.printf("%.2f",avgM[j]);
					System.out.println();
				}			
			}
			
			int sum = 0;
			int count = 0;
			for(int i=0;i<n;i++){
				sum = 0;
				for(int j=0;j<m;j++){
					if(a[i][j]>=avgM[j]){
						sum++;
					}
				}
				if(sum == m){
					count++;
				}
			}
			System.out.println(count);
			System.out.println();
		}
	}
}
