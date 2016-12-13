package hdu;

import java.util.Scanner;

public class No2017 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			String str = sc.next();
			char[] ch = str.toCharArray();
			int count = 0;
			for(int j=0;j<str.length();j++){
				if(ch[j]>=48 && ch[j]<=57){
					count++;
				}
			}
			System.out.println(count);
		}
		

	}

}
