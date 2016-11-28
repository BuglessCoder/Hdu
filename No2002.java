package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No2002 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("######0.000"); 
		final double PI = 3.1415927;
		while(sc.hasNext()){
			double r = sc.nextDouble();
			double v = (double)4/(double)3*r*r*r*PI;
			System.out.println(df.format(v));
		}

	}

}
