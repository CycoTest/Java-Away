public class If_ReviewEx01 {
	public static void main(String[] args) {
		int num1 = 3;
		
		if (num1 > 5) {
			System.out.println("A");
		} else {
			System.out.println("C");
		}
		// 뒤에 세미콜론(;)을 붙이는 게 원칙이긴 하지만, 안 붙여도 컴파일하는 데 아무런 문제가 없다
		// 하지만, 일반적으로 세미콜론(;)을 안 붙인다
		System.out.println("B");
/*
 * 		num1의 출력값은 if절의 조건에 따라 다르다
 * 		
 * 		1) num1의 변수값이 5 이하일 때, 출력값은 C와 B이다
 * 		2) num1의 변수값이 5 초과일 때, 출력값은 A와 B이다
 */
		
		
		int num2 = 8;
		if (num2 > 5) {
			System.out.println("A");
		} else if ( num2 > 7) {
			System.out.println("C");
		}
		System.out.println("B");
/*
 * 		num2의 출력값은 A, B, C일 거 같지만, 실행해보면 A와 B만 출력됨
 * 		if절에 else if문이 와도 중괄호{}범위로 보아
 * 		else if문은 if절 속에 포함된 한 문장으로 간주됨
 * 
 * 		이럴 경우, 조건을 모두 충족할 때는 제일 먼저 충족된 조건만 출력됨
 * 		따라서, 일반적인 if절의 조건을 만들 때
 * 		상위 조건부터 순차적으로 내려가면서 조건을 짬
 */
		
		int num3 = 9;
		if (num3 > 9) {
			System.out.println("A");
		} else if (num3 > 5) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		System.out.println("B");
		
/*
 * 		if절 속에 else문과 else if문이 모두 올 수 있음
 * 		단, 배치 순서가 존재함
 * 			1) if절의 시작은 언제나 if문이 먼저
 * 			2) else if문은 첫 번째 if문의 조건이 맞지 않을 때의 두 번째안인 셈이라서,
 * 				if문 바로 다음에 와야 함
 * 			3) else문의 위치: else if문이 없을 경우,
 * 				if절 속에서 if문 다음으로 와도 되고 안 와도 됨
 * 			4) else문의 위치: else if문이 있을 경우,
 * 				if절 속에서 else if문이 두 번째 if문이기 때문에 else if문 다음에 와야함
 */
	}
}