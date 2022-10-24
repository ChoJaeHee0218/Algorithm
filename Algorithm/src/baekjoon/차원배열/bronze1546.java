package baekjoon.차원배열;

import java.util.Scanner;

public class bronze1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		float max = 0;
		float sum = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(arr[i], max);
		}
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i]/max *100;
		}
		System.out.println(sum/N);
	}

}
