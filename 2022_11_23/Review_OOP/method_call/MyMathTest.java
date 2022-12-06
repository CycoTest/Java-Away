package method_call;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L);
		long result01 = mm.add(5, 3);
		
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);

		System.out.printf("add(5L, 3L) = %d\n", result1);
		System.out.printf("add(5L, 3L) = %d\n", result01);
		
		System.out.printf("subtract(5L, 3L) = %d\n", result2);
		System.out.printf("multiply(5L, 3L) = %d\n", result3);
		System.out.printf("divide(5L, 3L) = %f\n", result4);
	}
}
