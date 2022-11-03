package baekjoon;

import java.util.Scanner;

public class bronze1357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String X = sc.next();
		String Y = sc.next();
		
		StringBuffer sb = new StringBuffer(X);
		StringBuffer sb2 = new StringBuffer(Y);
        String reversedStr = sb.reverse().toString();
		String reversedStr2 = sb2.reverse().toString();
        
		int y = Integer.parseInt(reversedStr) + Integer.parseInt(reversedStr2);
        
		String h = Integer.toString(y);
		
		StringBuffer sb3 = new StringBuffer(h);
		String reversedStr3 = sb3.reverse().toString();
		
		System.out.println(Integer.parseInt(reversedStr3));
	}

}
