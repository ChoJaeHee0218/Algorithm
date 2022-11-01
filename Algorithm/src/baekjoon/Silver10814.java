package baekjoon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Silver10814 {

	// 번호 , 나이 , 이름 객체 생성
	static class member{
		int no;
		int age;
		String name;
		public member(int no, int age, String name) {
			this.no = no;
			this.age = age;
			this.name = name;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// member 의 객체들을 List를 통해 사용하겠다.
		
		ArrayList<member> mem = new ArrayList<member>();
		
		for(int i = 0; i < N; i++) {
			int age = sc.nextInt();
			String name = sc.nextLine();
			
			mem.add(new member(i, age, name));
			
		}
		// 리스트 자체를 정렬 하기위해서 사용.
		// Collections.reverseOrder(); // 내림차순
		
		Collections.sort(mem, new Comparator<member>() {

			@Override
			public int compare(member o1, member o2) {
				// 나이가 같으면
				if(o1.age == o2.age) {
					// 오름차순으로 리턴
					return Integer.compare(o1.no, o2.no);
				}
				// 그렇지 않다면
				return Integer.compare(o1.age, o2.age);
			}
			
		});
		// 향상된 포문으로 result의 저장된 이름과 나이 를 출력
		
		for(member result : mem) {
			System.out.println(result.age+result.name);
		}
	}

}
