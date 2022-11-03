package baekjoon.차원배열;

import java.util.Scanner;

public class bronze2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		double db = 0; // 학점
		
		char ch = str.charAt(0);
		
		if(ch == 'A' ) {
			db = 4;
		}
		else if(ch == 'B') {
			db = 3;
		}
		else if(ch == 'C') {
			db = 2;
		}
		else if(ch == 'D') {
			db = 1;
		}
		else {
			System.out.print(0.0);
			return;
		}
		ch = str.charAt(1);
		if(ch == '+') {
			db += 0.3;
		}
		else if(ch == '-') {
			db -= 0.3;
		}
		System.out.println(db);
	}

}
