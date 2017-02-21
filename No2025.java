package hdu;

import java.util.Scanner;

public class No2025 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			char[] ch = s.toCharArray();
			int k = 0;
			char max = ch[0];
			for(int i=1;i<ch.length;i++){
				if(ch[i]>max){
					max = ch[i];
					k = i;
				}
			}
			for(int i=0;i<ch.length;i++){
				System.out.print(ch[i]);
				if(ch[i] == max){
					System.out.print("(max)");
				}
			}
			System.out.println();
			
		}
	}

}
