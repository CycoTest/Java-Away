public class char_code {
	public static void main(String[] args) {
		char c = 'a'; // 문자 a의 숫자값은 97
		for (int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();

		c = 'A'; // 문자 A의 숫자값은 65
		for (int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();

		c = '0'; // 문자 0은 유니코드
		for (int i = 0; i < 10; i++) {
			System.out.print(c++);
		}
		System.out.println();
	}
}
/*
 * 유니코드(Unicode)
 * 	- 전 세계의 모든 문자를 다루도록 설계된 표준 문자 전산 처리 방식
 * 
 * 	- 초창기의 문자 코드는 아스키 코드(ASCII)의 로마자 위주 코드였고,
 * 	1바이트의 남은 공간에 각 나라가 자국 문자를 할당함.
 * 	하지만, 이런 상황에서 다른 국가에 이메일을 보냈더니 글자가 모두 깨졌고,
 * 	인터넷 웹페이지도 마찬가지.
 * 	
 * 	이에 따라 4바이트(32비트, 약 42억자)의 넉넉한 공간에 세상의 모든 문자를 할당한 결과물임
 * 
 */
