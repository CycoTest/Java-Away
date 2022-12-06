public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
/*
아스키 코드에 따르면, A의 2진수법 수는 1000001 이고, 이걸 10진법 수로 표현하면 65다

따라서, 변수 c1 과 c2 의 값은 동일하다
또한, 변수 타입 char 은 문자로 변수값을 저장한다

만약 c2 변수명을 지정하는 변수타입이 char 이 아닌 int 라면 
c2 변수값은 A가 아닌 65로 출력된다
 */
		System.out.println(c1);
		System.out.println(c2);
	}
}
/*
+ ASCII (아스키 코드) : American Standard Code for Information Interchange

-> 초창기에는 다양한 방법으로 문자를 표현했는데, 호환 등 여러 문제가 발생했다.
이러한 문제를 해결하기 위해 ANSI 에서 ASCII 라는 표준 코드를 제시했고,
현재 이 코드가 일반적으로 사용되고 있다
	
ASCII 는 각 문자를 7비트로 표현하므로 총 128(=2^7)개의 문자를 표현할 수 있다

아스키 코드에서 A 와 a 만 알고 있어도 됨
왜냐면, 알파벳 순서대로 순차적으로 1씩 증가하기 때문

A : 1000001
a : 1100001
*/