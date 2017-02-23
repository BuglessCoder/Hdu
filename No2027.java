package hdu;

import java.util.Scanner;

public class No2027 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<n;i++){
				if(i > 0) {  
                    System.out.println();  
                }  
				String s = sc.nextLine();
				int count1=0;
				int count2=0;
				int count3=0;
				int count4=0;
				int count5=0;
				for(int j=0;j<s.length();j++){
					if(s.charAt(j) == 'a' || s.charAt(j) == 'A'){
						count1++;
					}
					if(s.charAt(j) == 'e' || s.charAt(j) == 'E'){
						count2++;
					}
					if(s.charAt(j) == 'i' || s.charAt(j) == 'I'){
						count3++;
					}
					if(s.charAt(j) == 'o' || s.charAt(j) == 'O'){
						count4++;
					}
					if(s.charAt(j) == 'u' || s.charAt(j) == 'U'){
						count5++;
					}
				}
				System.out.println("a:" + count1);  
                System.out.println("e:" + count2);  
                System.out.println("i:" + count3);  
                System.out.println("o:" + count4);  
                System.out.println("u:" + count5);  
				//System.out.println("a:" + count1 + "\n" + "e:" + count2 + "\n" + "i:" + count3 + "\n" +  "o:" + count4 + "\n" + "u:" + count5 + "\n");
			}
			
		}

	}

}
