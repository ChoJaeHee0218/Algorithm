package baekjoon.차원배열;

import java.util.Scanner;

public class bronze2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int cnt = 0;
		int a = 0;
		int b = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] > cnt) {
					cnt = arr[i][j];
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][j] == cnt) {
					System.out.println(cnt);
					System.out.println((i+1) + " " +(j+1));
				}
			}
		}
	}

}
