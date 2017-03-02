package hdu;

import java.util.Scanner;

public class No2031 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int r = sc.nextInt();
			String s = Integer.toString(n,r);	//返回一个n的r进制表示的字符串
			s = s.toUpperCase();		//将小写字母变成大写
			System.out.println(s);
		}

	}

}
