package hdu;

import java.util.Scanner;

public class No2033 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			 int ah = sc.nextInt();
			 int am = sc.nextInt();
			 int as = sc.nextInt();
			 int bh = sc.nextInt();
			 int bm = sc.nextInt();
			 int bs = sc.nextInt();
			 
			 int h = 0;
				int m = 0;
				int[] result = new int [3];
				result[2] = (as+bs)%60;
				if(as+bs>=60){			
					m = 1;
				}
				result[1] = (am+bm)%60+m;
				if(am+bm>=60){
					h = 1;
				}
				result[0] = ah+bh+h;
				for(int j=0;j<3;j++){
					if(j!=2)
						System.out.print(result[j] + " ");
					else
						System.out.print(result[j]);
				}
				System.out.println();
		}
		
		
		

	}

}
