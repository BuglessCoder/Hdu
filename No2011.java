package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No2011 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			DecimalFormat df = new DecimalFormat("######0.00"); 
			for(int i=0;i<n;i++){
				double sum = 0;
				int m = sc.nextInt();
				for(double j=1;j<=m;j++){
					if(j%2==0){
						sum+=-(1/j);
					}
					else{
						sum+=(1/j);
					}
				}
				System.out.println(df.format(sum));
			}
			
			
		}

	}

}
