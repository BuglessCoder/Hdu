package hdu;

import java.util.Scanner;

public class No2005 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			String[] st =s.split("/");
			int[] time = new int[st.length];
			for(int i=0;i<st.length;i++){
				time[i] = Integer.parseInt(st[i]);
			}
			int day = 0;
			int[] month;
			if((time[0]%400==0) || ((time[0])%4==0) && (time[0]%100!=0)){
				month = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
			}
			else{
				month = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
			}
			for(int i=0;i<time[1]-1;i++){
				day+=month[i];
			}
			day+=time[2];
			System.out.println(day);
			
			
			
		}
	}

}
