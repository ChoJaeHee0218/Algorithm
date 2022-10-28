package baekjoon;

import java.util.Scanner;

public class bronze2979 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] arr = new int[100];
		
		int start = 0;
		int end = 0;
		int sum = 0;
		
		for(int i = 0; i < 3; i++) {
			start = sc.nextInt();
			end = sc.nextInt();
			
			for(int j = start; j< end; j++) {
				arr[j]++;
			}
		}
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == 1) {
				sum += A * arr[j];
			}else if(arr[j] == 2) {
				sum += B * arr[j];
			}else if(arr[j] == 3) {
				sum += C * arr[j];
			}
		}
		System.out.println(sum);
	}
}
