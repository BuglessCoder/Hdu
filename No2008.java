package hdu;

import java.util.Scanner;

public class No2008 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int zheng=0;
			int fu=0;
			int ling = 0;
			for(int i=0;i<n;i++){
				double input = sc.nextDouble();
				if(input > 0){
					zheng++;
				}
				else if(input < 0){
					fu++;
				}
				else{
					ling++;
				}
			}
			System.out.println(fu + " " + ling + " " + zheng);
		}
	}
}
