public class OperatorEx09_double {
	public static void main(String[] args) {
		byte a = 10;
		int b = 5;
		int c = 7;
		double d = 4.8;
/* 
변수값이 실수일 경우, 
	디폴트 타입은 double
	변수 타입 float는 변수값 뒤에 f를 붙인다
*/
		int result1 = a + b;
		double result2 = c + d;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
