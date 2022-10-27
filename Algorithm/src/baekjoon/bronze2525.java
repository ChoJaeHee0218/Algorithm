package baekjoon;

import java.util.Scanner;

public class bronze2525 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
	        int a = in.nextInt();
	        int b = in.nextInt();
	 
	        int c = in.nextInt();
	        
	        int min = 60 * a + b;
	        min += c;
	 
	        int hour = (min / 60) % 24;
	        int minute = min % 60;
	 
	        System.out.println(hour + " " + minute);
	}

}
