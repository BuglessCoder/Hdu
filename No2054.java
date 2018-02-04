package hdu;

import java.math.BigDecimal;
import java.util.Scanner;

public class No2054 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			BigDecimal a = scanner.nextBigDecimal();
			BigDecimal b = scanner.nextBigDecimal();
			if(a.compareTo(b) == 0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}
