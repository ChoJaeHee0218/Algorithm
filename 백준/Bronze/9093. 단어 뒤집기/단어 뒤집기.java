import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			for(int j = 0; j< arr.length; j++) {
				System.out.print(new StringBuilder(arr[j]).reverse().toString()+ " ");
			}
			System.out.println();
		}
	}
}
