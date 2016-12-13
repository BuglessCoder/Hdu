package hdu;

import java.util.Scanner;

public class No2018 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner sc=new Scanner(System.in);  
        while(sc.hasNextInt()){  
            int n=sc.nextInt();  
            if(n==0) {
            	System.exit(0);  
            }
            else{  
                int[]a=new int[56];  
	            for(int i=0;i<56;i++){  
	                if(i<=3) {
	                	a[i]=i;  
	                }
	                else{  
	                    a[i]=a[i-1]+a[i-3];  
	                }  
	            }  
	            System.out.println(a[n]);  
            }  
        }  
	}
}
