package baekjoon.�����迭;

import java.util.Scanner;

public class bronze1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] arr = new double[N];
		double max = 0;
		double sum = 0;
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
