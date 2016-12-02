package hdu;

import java.util.Scanner;

public class No2010 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] count = new int[1000];
			int flag = 0;
			int s = 0;
			if(m>n){  
	                int temp=m;  
	                m=n;  
	                n=temp;  
	        }  
			for(int i=m;i<=n;i++){
				int a = (int)i/100;
				int b = (int)i/10 - a*10;
				int c = i%10;
				if(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i){
					flag = 1;
					count[s] = i;
					s++;
				}
			}

			if(flag == 0){
				System.out.println("no");
			}
			
			else{
				for(int j=0;j<count.length;j++){
					if(count[j]!=0){
						if(j==s-1){
							System.out.print(count[j]);
						}
						else{
							System.out.print(count[j] + " ");
						}
					}
				}
				System.out.println();
			}
			
		}
	}
}
