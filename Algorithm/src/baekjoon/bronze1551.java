package baekjoon;

import java.util.Scanner;

public class bronze1551 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1�� ���ڿ� �޴´�.
		//2�� , �������� ���ø��� �ϰ� String �迭�� �ִ´�.
		//3�� ������ ���������� ��ȯ�ϰ� ������ �迭�� �ִ´�.
		
		String N = sc.next();
		int K = sc.nextInt();
		String[] arr = new String[K];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
