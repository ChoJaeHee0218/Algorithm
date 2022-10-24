package baekjoon.¹Ýº¹¹®;

import java.util.Scanner;

public class bronze10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			sum = a+b;
			System.out.println(sum);
			
		}
		
	}

}
