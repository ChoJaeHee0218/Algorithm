package baekjoon.¹®ÀÚ¿­;

import java.util.Scanner;

public class bronze7567 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int num = 10;

		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i -1) == str.charAt(i)) {
				num += 5;
			}
			else {
				num += 10;
			}
		}
		System.out.println(num);
	}
}
