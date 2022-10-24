package baekjoon.차원배열;

import java.util.Scanner;

public class bronze10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		int cnt = 0;
		
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
			
		}
		int b = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(b == arr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
