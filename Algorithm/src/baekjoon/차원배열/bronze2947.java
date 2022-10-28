package baekjoon.차원배열;

import java.util.Scanner;

public class bronze2947 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int a = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = sc.nextInt();
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				} 
			}
		}
	}
}
