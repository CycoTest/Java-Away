public class OperatorEx11_char_type {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);
		// 명시적 타입 캐스팅 : 강제로 타입 변환을 지정하기 위해 타입을 넣는다
		// char 타입을 강제로 넣지 않으면, 코딩 오류가 일어난다
		// 왜냐면 우항의 산출 타입의 디폴트값은 int 타입이기 때문이다
		// char 타입은 2 byte, int 타입은 4 byte
		
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		System.out.println("c3 : "+c3);
	}
}
