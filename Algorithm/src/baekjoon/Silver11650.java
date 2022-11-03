package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Silver11650 {
	
	static class point{
		int x;
		int y;
		public point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<point> xy = new ArrayList<point>();
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			xy.add(new point(x, y));
		}
		Collections.sort(xy, new Comparator<point>() {

			@Override
			public int compare(point o1, point o2) {
				if(o1.x == o2.x) {
					return Integer.compare(o1.y, o2.y);
				}
				return Integer.compare(o1.x, o2.x);
			}
			
		});
		for(point result : xy) {
			System.out.println(result.x + " " + result.y);
		}
	}

}
