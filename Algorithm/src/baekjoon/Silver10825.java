package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Silver10825 {
	
	static class state{
		String name;
		int kor;
		int eng;
		int mat;
		
		public state(String name, int kor, int eng, int mat) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		ArrayList<state> sts = new ArrayList<state>();
		
		for(int i = 0; i < N; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			
			sts.add(new state(name,kor,eng,mat));
		}
		
		Collections.sort(sts, new Comparator<state>() {

			@Override
			public int compare(state o1, state o2) {
				//국어 점수가 같으면 영어점수가 증가하는순서
				if(o1.kor == o2.kor) {
					if(o1.eng == o2.eng) {
						if(o1.mat == o2.mat) {
							return o1.name.compareTo(o2.name);
						}
						return -Integer.compare(o1.mat, o2.mat);
					}
					return Integer.compare(o1.eng, o2.eng);
				}
				return -Integer.compare(o1.kor, o2.kor);
			}
			
		});
		
		for(state result : sts) {
			System.out.println(result.name);
		}
	}

}
