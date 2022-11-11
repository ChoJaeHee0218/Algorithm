package baekjoon.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5717 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	        //String str = br.readLine();   // 입력을 2 2 로 받음
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); 
			int b = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0) break;
			int sum = a+b;
		    
			bw.write(sum+"\n");
		}
			br.close();
			bw.flush();
			bw.close();
	        
	}

}
