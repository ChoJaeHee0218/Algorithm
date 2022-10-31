package baekjoon.¹®ÀÚ¿­;

import java.util.Scanner;

public class bronze9093 {
	/*
	 * public ArrayList<String> solution(int T, String[] str){ ArrayList<String>
	 * answer = new ArrayList<>(); for(String x : str) { String temp = new
	 * StringBuilder(x).reverse().toString(); answer.add(temp); }
	 * 
	 * return answer; } public static void main(String[] args) { Main Y = new
	 * Main(); Scanner sc = new Scanner(System.in);
	 * 
	 * int T = sc.nextInt();
	 * 
	 * String[] str = new String[T];
	 * 
	 * for(int i=0; i < T; i++) { str[i] = sc.next(); } for(String x : Y.solution(T,
	 * str)) { System.out.println(x); } }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			for(int j = 0; j< arr.length; j++) {
				System.out.print(new StringBuilder(arr[j]).reverse().toString()+ " ");
			}
			System.out.println();
		}
	}
}
