public class BitLogicEx01 {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45     = " + (~45));
	}
}
/*
논리 연산자

논리곱(AND) : && , &
	+ 피연산자 모두가 true일 때만 연산 결과는 true
	- true & true = true
	- true & false = false
	- false & true = false
	- false & false = false
	
논리합(OR) : | , ||
	+ 피연산자 모두가 false일 때만 연산 결과는 false
	- true | true = true
	- true | false = true
	- false | true = true
	- false | false = false
	
베타적 논리합(XOR) : ^
	+ 두 피연산자가 같을 경우 true, 다를 경우 false
	- true ^ true = false
	- true ^ false = true
	- false ^ true = true
	- false ^ false = false
	
논리 부정 (NOT) : !
	+ 피연산자의 논리값을 바꿈
	- !true = false
	- !false = true
*/