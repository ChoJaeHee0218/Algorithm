package baekjoon.�ݺ���;

import java.util.Scanner;

public class bronze2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		int max=0;
		for(int i =0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(arr[i], max);
		}
		System.out.println(max);
		for(int i = 0; i < arr.length; i++) {
			if(max == arr[i]) {
				System.out.println(i+1);
			}
			
		}
	}

}
