public class PrintfEx01 {
	public static void main(String[] args) {
		byte b = 1;
		short s =2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L; // long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8진수 10, 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2
		
		// printf(); 출력 형식은 괄호 안에 반드시 쌍따옴표(")가 들어가고, 콤마(,)를 넣고 출력하고자 하는 변수를 넣음
		System.out.printf("b=%d\n", b);
		System.out.printf("s=%d\n", s);
		System.out.printf("c=%c, %d\n", c, (int) c);
		// c 타입은 char 타입의 변수인데, (int)를 넣음으로써 강제로 int 타입으로 형변환시켜 c의 정수값을 불러옴
		System.out.printf("finger= [%5d]\n", finger);
		// %5d : 5포인트의 공백을 좌측에 넣고, 정수로 출력한다는 의미
		System.out.printf("finger= [%-5d]\n", finger);
		// %-5d : 5포인트의 공백을 우측에 넣고, 정수로 출력한다는 의미
		System.out.printf("finger= [%05d]\n", finger);
		// %05d : 5포인트의 공백을 우측에 넣되 공백 자리를 0으로 채우고, 정수로 출력한다는 의미 
		System.out.printf("big=%d\n", big);
		System.out.printf("hex=%#x\n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d\n", octNum, octNum);
		System.out.printf("hexNum=%x, %d\n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d\n", Integer.toBinaryString(binNum), binNum);		
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
