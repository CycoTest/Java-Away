public class PrintfEx02 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		// float 타입은 변수값 뒤에 f를 붙여야 함
		float f1 = .10f;
		// .10f : 0.1 = 1.0 x 10^4
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.2346789;
		
		// %f : 부동 소수점(floating-point)의 형식으로 출력
		System.out.printf("f1=%f, %e, %g\n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g\n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g\n", f3, f3, f3);
		System.out.printf("d=%f\n", d);
		System.out.printf("d=%14.10f\n", d);
		// %전체자리.소수점아래자리f
		// %14.10f : 전체 공간은 14자리, 소수점은 10번째자리까지만 출력
		// 따라서, 소수점을 기준으로 자릿수를 보면 소수점 앞자리가 4자릿수이고 소수점 뒷자리는 10자릿수로 표기되어 나옴
		// 만약 %014.10f : 공백 자리를 0으로 채워서 출력
		
		System.out.printf("[12345678901234567890]\n");
		System.out.printf("[%s]\n", url);
		System.out.printf("[%20s]\n", url); 
		System.out.printf("[%-20s]\n", url);
		System.out.printf("[%.8s]\n", url);
	}
}
/*
지시자 종류
	1. %b : boolean 형식으로 출력 
	2. %d : 10진(decimal) 정수의 형식으로 출력
	3. %o : 8진(octal) 정수의 형식으로 출력
	4. %x, %X : 16진(hexa-decimal) 정수의 형싱으로 출력
	5. %f :	부동 소수점(floating-point)의 형식으로 출력
	6. %e, %E :	지수(exponent) 표현식의 형식으로 출력
	7. %c : 문자(character)로 출력
	8. %s : 문자열(string)로 출력
*/