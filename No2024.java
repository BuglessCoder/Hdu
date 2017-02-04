package hdu;

import java.util.Scanner;

public class No2024 {

	public static void main(String[] args)  {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int n;  
        char c;  
        boolean b;  
        while (sc.hasNext()) {  
            n = sc.nextInt();  
            String str = sc.nextLine();  
            String[] ar = new String[n];  
            for (int i = 0; i < n; ++i) {  
                ar[i] = sc.nextLine();  
                b = true;  
                for (int j = 0; j < ar[i].length(); ++j) {  
                    c = ar[i].charAt(j);  
                    if (j == 0) {  
                        if (Character.isLetter(c) || c == '_') {  
  
                        } else {  
                            b = false;  
                            break;  
                        }  
                    } else {  
                        if (c == '_' || Character.isDigit(c)  
                                || Character.isLetter(c)) {  
  
                        } else {  
                            b = false;  
                            break;  
                        }  
                    }  
  
                }  
  
                if (b) {  
                    System.out.println("yes");  
                } else  
                    System.out.println("no");  
            }  
  
        }  
		

	}

}
