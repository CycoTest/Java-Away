public class OperatorEx07_Boolean {
	public static void main(String[] args) {
		boolean bPlay = true;
		
		System.out.println(bPlay);
		
		bPlay = !bPlay;
		System.out.println(bPlay);
		
		bPlay = !bPlay;
		System.out.println(bPlay);
	}
}
/*
변수명 짓는 법
	1. 헝가리안 표기법
		- C 언어 진영에서 쓰이다가 안 쓰이는 표기법
		- 변수명에 타입형을 구분지을 수 있는 접두사를 달아서 표기
			ex) boolean 타입 변수명  : bPlay
			ex) integer 타입 변수명 : iNum
			
	2. 카멜 표기법
		- 단봉낙타 표기법
		- 첫 문자 첫글자는 소문자로 표기, 그 이후 연결된 문자들은 첫글자 대문자로 표기
			ex) helloWorld, insertBbsData...
		- 변수명, 함수명에 사용
		
	3. 파스칼 표기법
		- 쌍봉 낙타 표기법
		- 모든 문자의 첫글자를 대문자로 표기
			ex) HelloWorld, InsertBbsData...
		- 클래스명에 사용, 가끔 함수/변수에도 사용
		- 안드로이드
		
	4. 스네이크 표기법
		- 모든 문자의 첫글자를 소문자로 표기, 각 문자들을 언더바('_')로 이어서 사용
			ex) hello_world, insert_bbs_data...
		- 변수명, 함수명, 데이터 타입형, 네임스페이스 등에 사용
		- 안드로이드
*/