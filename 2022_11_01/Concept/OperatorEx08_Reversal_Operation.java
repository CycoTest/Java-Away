public class OperatorEx08_Reversal_Operation {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		b = ~a;
		
		System.out.println(a);
		System.out.println(b);
		
		b = ~b;
		
		System.out.println(b);
	}
}
/*
비트 반전 연산자 : ~a
	- 정수 타입(byte, short, int, long)의 피연산자에만 사용됨
	- 피연산자를 2진수로 표현했을 때 비트값을 변경
	
	* 주의사항: 비트 반전 연산자의 산출 타입은 int 타입이 됨
		-> int 타입 = 4 byte = 32 bit
		
* 2의 보수 = 1의 보수 + 1
*/