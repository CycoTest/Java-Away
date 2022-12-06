public class BitLogicEx02 {
	public static void main(String[] args) {
		int a = 8;
		int A = -8;
		
		int b = a << 2;
		int c = a >> 2;
		int d = a >>> 2;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int B = A << 2;
		int C = A >> 2;
		int D = A >>> 2;
		
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
	}
}
/*
비트 연산자 : &, |, ~, <<, >>, >>>
	- 데이터를 비트(bit) 단위로 연산
	- 피연산자가 boolean 타입일 경우, 일반 논리 연산자
	- 피연산자가 정수 타입일 경우, 비트 논리 연산자
	
비트 이동 연산자 : <<, >>, >>>
	- 정수 데이터의 비트를 좌측 또는 우측으로 밀어서 이동시키는 연산
	- A << B : 정수 A의 각 비트를 B만큼 좌측으로 이동 
		(빈자리는 0으로 채워진다)
	- A >> B : 정수 A의 각 비트를 B만큼 우측으로 이동
		(빈자리는 A의 최상위 부호 비트(MSB)와 같은 값으로 채워진다)
			=> A가 음수일 경우, MSB는 1
			=> A가 0 혹은 양수일 경우, MSB는 0
	- A >>> B : 정수 A의 각 비트를 B만큼 우측으로 이동
		(빈자리는 0으로 채워진다)
			=> A가 양수든 음수든 0이든 상관없이 양수로 적용
*/