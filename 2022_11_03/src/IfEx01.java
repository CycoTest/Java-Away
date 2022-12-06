public class IfEx01 {
	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
/*
Ch 4. 조건문 & 반복문

조건문
	- if 문
	- 형식
		if (condition) {
		} 
		: 조건이 true일 때 실행, false일 때 해당 조건을 건너뜀
			
		if (condition) {
		} else if (condition) {
		} 
		: 첫 조건이 false일 때, 두 번째 조건으로 넘어감
			첫 조건이 true일 때, 나머지 조건들은 건너뜀
			
		if (condition) {
		} else {
		} 
		: 첫 조건이 true일 때 뒤에 이어진 것들 다 무시하고 첫 조건만 실행
			만약 else절 앞의 조건들이 모두 false일 때, else절의 조건이 실행

		
	- switch 문
	
반복문 
	- for
	- while
	- do-while
*/