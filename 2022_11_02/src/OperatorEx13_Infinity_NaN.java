public class OperatorEx13_Infinity_NaN {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
//		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		System.out.println(z + 2);
	}

}
/*
5 / 0 = ArithmeticException 예외 발생
5 % 0 = ArithmeticException 예외 발생

NaN : Not a Number
Infinity : 무한대
*/