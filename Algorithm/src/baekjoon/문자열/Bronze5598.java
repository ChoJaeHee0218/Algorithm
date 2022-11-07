package baekjoon.¹®ÀÚ¿­;

import java.util.Scanner;

public class Bronze5598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A') {
				ch[i] = 'X';
			}
			else if(str.charAt(i) == 'B') {
				ch[i] = 'Y';
			}
			else if(str.charAt(i) == 'C') {
				ch[i] = 'Z';
			}
			else {	
				ch[i] = (char) (str.charAt(i)-3);
			}
			System.out.print((char)ch[i]);
		}
		
		
	}

}
