package baekjoon;

import java.util.Scanner;

public class bronze1551 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1번 문자열 받는다.
		//2번 , 기준으로 스플릿을 하고 String 배열로 넣는다.
		//3번 넣은걸 정수형으로 변환하고 정수형 배열로 넣는다.
		
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
