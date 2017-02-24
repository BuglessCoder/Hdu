package hdu;

import java.util.Scanner;

public class No2029 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				String s = sc.next();
				char[] ch = s.toCharArray();
				int sum = 0;
				for(int j=0;j<ch.length/2;j++){
					if(ch[j] == ch[ch.length-1-j]){
						sum++;
					}
				}
				if(sum == ch.length/2){
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}
			}
		}

	}

}
