package baekjoon.반복문;

public class 테스트 {

	public static void main(String[] args) {
		for(int row=2;row<=9;row++) {
			for(int col=1;col<=9;col++) {
				System.out.print(row + " * " + col + " = " + row*col);
			}
			System.out.println();
		}
	}
}
