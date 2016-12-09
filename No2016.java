package hdu;

import java.util.Scanner;

public class No2016 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0){
				System.exit(0);
			}
			else{
				int[] a = new int[n];
				for(int i=0;i<n;i++){
					int in = sc.nextInt();
					a[i] = in;
				}
				int min = a[0];
				int flag = 0;
				for(int i=1;i<n;i++){
					if(a[i]<min){
						min = a[i];
						flag = i;
					}
				}
				if(min!=a[0]){
					int temp;
					temp = a[0];
					a[0] = a[flag];
					a[flag] = temp;
				}
				for(int i=0;i<n;i++){
					if(i==n-1)
						System.out.println(a[i]);
					else
						System.out.print(a[i]+" ");
				}
			}
		
		}

	}

}
