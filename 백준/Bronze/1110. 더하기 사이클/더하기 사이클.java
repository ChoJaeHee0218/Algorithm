import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int num = a;
		int cnt = 0;
		while (true) {
			a = (a % 10) * 10 + ((a / 10) + (a % 10)) %10;
			cnt++;
			if (a == num) {
				break;
			}
		}
		System.out.println(cnt);
	}

}