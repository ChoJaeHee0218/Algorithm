package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Silver5635 {
	
	static class birthday{
		String name;
		int dd;
		int mm;
		int yyyy;
		public birthday(String name, int dd, int mm, int yyyy) {
			this.name = name;
			this.dd = dd;
			this.mm = mm;
			this.yyyy = yyyy;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<birthday> bd = new ArrayList<birthday>();
		
		for(int i = 0; i < N; i++) {
			String name = sc.next();
			int dd = sc.nextInt();
			int mm = sc.nextInt();
			int yyyy = sc.nextInt();
			
			bd.add(new birthday(name, dd, mm, yyyy));
		}
		Collections.sort(bd, new Comparator<birthday>() {

			@Override
			public int compare(birthday o1, birthday o2) {
				// 나이가 가장 적은사람
				if(o1.yyyy == o2.yyyy) {
					if(o1.mm == o2.mm) {
						return -Integer.compare(o1.dd, o2.dd);
					}
					return -Integer.compare(o1.mm, o2.mm);
				}
				return -Integer.compare(o1.yyyy, o2.yyyy);
			}
			
		});
		System.out.println(bd.get(0).name);
		System.out.println(bd.get(N-1).name);
	}
}
