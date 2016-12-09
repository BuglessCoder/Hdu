package hdu;

import java.util.Scanner;

public class No2015 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int sum = 0;
			int x = 2;
			int length = 0;
			
			if(n%m==0){
				length = n/m;
			}
			else length = n/m+1;
			
			int[] a = new int[length];
			if(n%m==0){
				
				for(int i=0;i<length;i++){
					for(int j=0;j<m;j++){
						sum+=x;
						x+=2;
					}
					
					a[i] = sum/m;
					sum = 0;
					
				}
			}
			else{
				for(int i=0;i<length;i++){
					if(i==length-1){
						for(int j=0;j<(n%m);j++){
							sum+=x;
							x+=2;
						}
						a[i]=sum/(n%m);
					}
					else{
						for(int j=0;j<m;j++){
							sum+=x;
							x+=2;
						}
						a[i] = sum/m;
					}
					sum = 0;
					
				}
			}
			for(int i=0;i<length;i++){
				if(i==length-1){
					System.out.println(a[i]);
				}
				else{
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
