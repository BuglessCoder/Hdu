package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No2003 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("######0.00"); 
		while(sc.hasNext()){
			double a = sc.nextDouble();
			System.out.println(df.format(Math.abs(a)));
			
		}

	}

}
