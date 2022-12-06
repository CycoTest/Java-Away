public class four_fundamental_words {
	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		char zero = '0'; // 숫자 0이 아닌 아스키 코드인 문자 0을 의미
		char two = '2';

		System.out.printf("'%c' - '%c' = %d\n", d, a, d - a);
		System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);

		System.out.printf("'%c'=%d\n", a, (int) a);
		System.out.printf("'%c'=%d\n", d, (int) d);
		System.out.printf("'%c'=%d\n", zero, (int) zero);
		System.out.printf("'%c'=%d\n", two, (int) two);
	}
}
