package hdu;

import java.util.Scanner;

public class No2004 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int t = sc.nextInt();
			if(t>=90 && t<=100){
				System.out.println('A');
			}
			else if(t>=80 && t<=89){
				System.out.println('B');
			}
			else if(t>=70 && t<=79){
				System.out.println('C');
			}
			else if(t>=60 && t<=69){
				System.out.println('D');
			}
			else if(t>=0 && t<=59){
				System.out.println('E');
			}
			else System.out.println("Score is error!");
		}

	}

}
