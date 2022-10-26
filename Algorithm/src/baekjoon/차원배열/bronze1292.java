package baekjoon.차원배열;

import java.util.Scanner;

public class bronze1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int number = sc.nextInt();
		int[] arr = new int[number];
		int check = 1;
		int cnt = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = check;
			cnt++;
			if(cnt == check) {
				check++;
				cnt = 0;
			}
		}
		for(int i = num -1; i < number; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
