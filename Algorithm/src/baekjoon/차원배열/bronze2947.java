package baekjoon.차원배열;

import java.util.Scanner;

public class bronze2947 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int a = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j+1] < arr[j]) {
					a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
					for(int k : arr)
					System.out.print(k+" ");
					System.out.println();
				} 
			}
		}
	}
}
