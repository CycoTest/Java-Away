package ex01_recursive.call;

public class PowerTest2 {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long result = 0;

		for (int i = 1; i <= n; i++) {
			result += Math.pow(x, i);
		}
		System.out.println(result);
	}
}
