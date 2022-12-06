public class PPEx1 {
	public static void main(String[] args) {
		int A = 5;
		
		System.out.println(A++);
//	1. System.out.println(A); A = 5를 출력
//  2. A++; A = A + 1, 출력 후 연산이 들어갔기 때문에, A값은 6
		System.out.println(A);
//  2번의 값이 그대로 출력, A = 6으로 출력
	}
}
/*
+ 증감 연산자(++,--)

연산식

++/-- 피연산자
	다른 연산을 수행하기 "전"에 피연산자의 값을 1 증가/감소시킴
	ex) ++A / --A
	
피연산자 ++/--
	다른 연산을 수행한 "후"에 피연산자의 값을 1 증가/감소 시킴
	ex) A++ / A--
*/