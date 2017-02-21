package hdu;

import java.util.Scanner;

public class No2026 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			char[] ch = s.toCharArray();
			ch[0] = Character.toUpperCase(ch[0]);
			for(int i=1;i<ch.length;i++){
				if(ch[i] == ' '){
					ch[i+1] = Character.toUpperCase(ch[i+1]);					
				}
			}
			for(int i=0;i<ch.length;i++){
				System.out.print(ch[i]);
			}
			System.out.println();
		}

	}

}
