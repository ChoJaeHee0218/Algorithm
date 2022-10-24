package baekjoon.차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class bronze10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int[] a = new int[temp];
		
		
		for(int i = 0; i < temp; i++) {
			int num = sc.nextInt();
			a[i] = num;
		}
		Arrays.sort(a);
		System.out.print(a[0]+ " " +a[a.length - 1]);
	}

}
