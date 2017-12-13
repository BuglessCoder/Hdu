package hdu;

import java.util.Scanner;

public class No2043 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0;i<n;i++){
			String string = scanner.next();
			if(string.length()>=8 && string.length()<=16){
				char[] cs = string.toCharArray();
				int a=0,b=0,c=0,d=0;
				for(int j=0;j<string.length();j++){
					if(cs[j]>='0' && cs[j]<='9'){
						a=1;
					}
					else if(cs[j]>='a' && cs[j]<='z'){
						b=1;
					}
					else if(cs[j]>='A' && cs[j]<='Z'){
						c=1;
					}
					else if(cs[j]=='~' || cs[j]=='!' || cs[j]=='@' || cs[j]=='#' || cs[j]=='$'
							|| cs[j]=='%' || cs[j]=='^'){
						d=1;
					}
					else{
						System.out.println("NO");
						break;
					}
				}
				if((a==1&&b==1&&c==1) || (a==1&&b==1&&d==1) || (a==1&&c==1&&d==1) || (d==1&&b==1&&c==1)){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			else{
				System.out.println("NO");
			}
		}
	}

}
