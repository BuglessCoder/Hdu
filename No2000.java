package hdu;

import java.util.Arrays;
import java.util.Scanner;

public class No2000 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			char[] ch = new char[3];
			ch = str.toCharArray();			//将字符串str复制到字符数组ch
			Arrays.sort(ch);
			System.out.println(ch[0] + " " + ch[1] + " " + ch[2]);
			
		}
		
	}
}




 




















