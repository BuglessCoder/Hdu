package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No2009 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double n = sc.nextInt();
			int m = sc.nextInt();
			double sum = 0;
			for(int i=0;i<m;i++){
				sum+=n;
				n = Math.sqrt(n);
			}
			DecimalFormat df = new DecimalFormat("######0.00"); 
			System.out.println(df.format(sum));
		}

	}

}
