package hdu;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class No2034 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while(true){
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if(m==0 && n==0){
				break;
			}
			Set<Integer> set = new TreeSet<Integer>();
			for(int i=0;i<n;i++){
				int x = scanner.nextInt();
				set.add(x);
			}
			for(int j=0;j<m;j++){
				int x = scanner.nextInt();
				if(set.contains(x)){
					set.remove(x);
				}
			}
			if(set.isEmpty()){
				System.out.print("NULL");
			}
			for(Integer i:set){
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
