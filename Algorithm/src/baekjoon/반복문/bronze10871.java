package baekjoon.�ݺ���;

import java.util.Scanner;

public class bronze10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		int num = sc.nextInt(); //�꺸�� ����
		//int num1 = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < num) {
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
