package baekjoon;

import java.util.Scanner;

public class bronze2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 큰수
		int B = sc.nextInt(); // 작은수
		int temp = 0;
		
		if(A < B) {
			temp = A;
			A = B;
			B = temp;
		}
		for(int i = B; i > 0; i--) {
			if(A % i == 0 && B % i ==0) {
				System.out.println(i);
				break;
			}
		}
		for(int i = A; i <= B*A; i++) {
			if(i % A == 0 && i % B == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
