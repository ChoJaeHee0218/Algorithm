package baekjoon.¹®ÀÚ¿­;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze1264 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String str = br.readLine();
			
			if(str.equals("#")) {
				break;
			}
			str = str.toLowerCase();
			int a = 0;
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					a++;
				}
			}
			System.out.println(a);
		}
		br.close();
	}

}
