package hdu;

import java.util.Scanner;

public class No2012 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = 0;
			if((x==0)&&(y==0)){
				System.exit(0); 
			}
			else{
				if(x>y){  
	                int temp=x;  
	                x=y;  
	                y=temp;  
	            }  
				boolean flag = true;
				for(int i=x;i<=y;i++){
					sum = i*i+i+41;
					for(int j=2;j<i;j++){
						if(i%j==0){
							flag = false;
						}
					}
				}
				
				if(flag == true){
					System.out.println("OK");
				}
				else{
					System.out.println("Sorry");
				}
				flag = true;
			}
		}
	}
}
