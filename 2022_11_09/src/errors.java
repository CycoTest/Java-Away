public class errors {
	public static void main(String[] args) {
		
//		1. 컴파일 에러(compile error)
		byte a = 10;
		byte b = 29;
		byte c = (byte)(a + b);
//		a 와 b는 모두 int형보다 작은 데이터 범위인 byte형이기 때문에,
//		연산자 '+'는 이 2개의 피연산자들의 자료형으을 int형으로 변환한 다음에 연산을 수행함
//		그리하여, 우항의 값은 int형으로 된 채로 나오기 때문에
//		(byte)라는 명시적 타입 캐스팅을 해주지 않으면 좌우항의 자료형이 일치하지 않아 컴파일 에러가 발생함
		
		System.out.println(c);
		
//		2. 데이터, 값의 손실
		byte A = 10;
		byte B = 30;
		byte C = (byte) (A * B);
/*
 * 		A * B의 값은 300이고, 이를 2진수로 나타내면 아래와 같다
 * 		300 = 100101100
 * 		
 * 		헌데, C의 값은 300이 아닌 44로 나왔다
 * 		A * B 의 연산식에서 강제로 byte 타입을 넣은 까닭에 A와 B의 자료형 타입이 
 * 		44 =   00101100
 * 
 *  
 */
		
		System.out.println(C);
	}
}
