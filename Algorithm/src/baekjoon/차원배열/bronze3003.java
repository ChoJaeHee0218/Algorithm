package baekjoon.차원배열;

import java.util.Scanner;

public class bronze3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,1,2,2,2,8};
		int[] a = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			int arr2 = sc.nextInt();
			a[i] = arr[i] - arr2;
			System.out.print(a[i] + " ");
		}
	}

}
