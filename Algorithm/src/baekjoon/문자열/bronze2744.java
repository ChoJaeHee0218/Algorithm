package baekjoon.¹®ÀÚ¿­;

import java.util.Scanner;

public class bronze2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(String.valueOf(ch).toLowerCase());
			}
			else {
				System.out.print(String.valueOf(ch).toUpperCase());
			}
		}
	}

}
