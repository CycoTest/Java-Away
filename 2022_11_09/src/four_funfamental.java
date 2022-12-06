public class four_funfamental {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;

		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.printf("%d + %d = %d\n", a, b, a + b);
//		
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d / %.1f = %.1f\n", a, (float) b, (float) a / (float) b);
	}
}
