package baekjoon.차원배열;

import java.util.Scanner;

public class bronze2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] arr = new int[a][b];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < a; j++) {
				for(int z = 0; z < b; z++) {
					arr[j][z] += sc.nextInt();
				}
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
	}

}
