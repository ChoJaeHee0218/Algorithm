package baekjoon;

import java.util.Scanner;

public class bronze5554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		for(int i=0; i<4; i++) {
			result += sc.nextInt();
		}
		int min = result / 60;
		int max = result % 60;
		
		System.out.println(min);
		System.out.println(max);
	}

}
