package hdu;

import java.util.Scanner;

public class No2030 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-->0){
			int count = 0;
			String s = sc.nextLine();
			byte[] b = s.getBytes(); 
			for(int i=0;i<b.length;i++){
				if(b[i]<0){
					count++;
				}
			}
			System.out.println(count/3);
		}
	}

}
