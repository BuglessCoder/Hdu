package hdu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No2001 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("######0.00");   
		while(sc.hasNext()){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			System.out.println(df.format(distance));
			
		}

	}

}
