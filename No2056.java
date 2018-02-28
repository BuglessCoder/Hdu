package hdu;

import java.util.Scanner;

public class No2056 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			
			double a,b,c,d;
			if(x1>x2){
				double temp = x1;
				x1 = x2;
				x2 = temp;
			}
			if(y1>y2){
				double temp = y1;
				y1 = y2;
				y2 = temp;
			}
			if(x3>x4){
				double temp = x3;
				x3 = x4;
				x4 = temp;
			}
			if(y3>y4){
				double temp = y3;
				y3 = y4;
				y4 = temp;
			}
			
			if(x3>=x2 || x4<=x1 || y3>=y2 || y4<=y1){
				System.out.println("0.00");
			}
			else{
				if(x1>x3){
					a = x1;
				}
				else{
					a = x3;
				}
				
				if(x2>x4){
					b = x4;
				}
				else{
					b = x2;
				}
				
				if(y1>y3){
					c = y1;
				}
				else{
					c = y3;
				}
				
				if(y2>y4){
					d = y4;
				}
				else{
					d = y2;
				}
				System.out.println(String.format("%.2f", (b-a)*(d-c)));
			}
			
			
			
			
		}

	}

}
