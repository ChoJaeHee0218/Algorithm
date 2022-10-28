package baekjoon.¹®ÀÚ¿­;

import java.util.Scanner;

public class bronze10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(str.length() - i - 1)) {
				cnt++;
			}
			else {
				cnt = 0;
				System.out.println(cnt);
				break;
			}
		}
		if(cnt >= str.length()/2) {
			System.out.println("1");
		}
	}
}
