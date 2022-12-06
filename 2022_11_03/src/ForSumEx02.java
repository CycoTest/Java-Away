import java.util.Scanner;

public class ForSumEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		long sum = 0;
		sc.close();

		for (int i = 1; i <= inp; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
