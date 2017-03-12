package hdu;

import java.math.BigInteger;
import java.util.Scanner;

public class No2035 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while(true){
			BigInteger a = scanner.nextBigInteger();
			int b = scanner.nextInt();
			if(a.equals(BigInteger.ZERO) && b==0){
				break;
			}
			System.out.println(a.pow(b).mod(new BigInteger("1000")));
			
		
			
		}

	}

}
