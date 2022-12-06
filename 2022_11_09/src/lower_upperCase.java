public class lower_upperCase {
	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char) (lowerCase - 32);

		System.out.println(upperCase);
	}
}
/*
 * 아스키 코드(ASCII) 소문자/대문자
 * 	- 소문자 a의 아스키 코드값 = 97
 * 		+ b부터 순차적으로 1씩 증가
 * 	- 대문자 A의 아스키 코드값 = 65
 *		+ B부터 순차적으로 1씩 증가 
 * 
 * 	따라서, 각 문자별 소문자/대문자의 차이는 32가 나옴	
 */
