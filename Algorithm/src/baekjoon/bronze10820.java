package baekjoon;

import java.util.Scanner;

public class bronze10820 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNextLine()) {
			String N = sc.nextLine();
			int cnt = 0;
			int cnt2 = 0;
			int cnt3 = 0;
			int cnt4 = 0;
			for(int i=0;i<N.length();i++) {
				if(N.charAt(i) >= 'a' && N.charAt(i) <= 'z') {
					cnt2++;
				}
				else if(N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
					cnt++;
				}
				else if(N.charAt(i) >= '0' && N.charAt(i) <= '9') {
					cnt3++;
				}
				else if(N.charAt(i) == ' ') {
					cnt4++;
				}
			}
			System.out.println(cnt2+" "+cnt+" "+  cnt3 +" "+ cnt4);
			
		}
			
		}

}
