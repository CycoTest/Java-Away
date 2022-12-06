package concept_examples;
public class parsing_analyzes_character_arrays {
	public static void main(String[] args) {
		char[] hex = { 'C', 'A', 'F', 'E' };

		String[] binary = { "0000", "0001", "0010", "0011"
						, "0100", "0101", "0110", "0111"
						, "1000", "1001", "1010", "1011"
						, "1100", "1101", "1110", "1111" };

		String result = "";

		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') { // 아스키 코드값으로 비교. 즉, 배열값에 숫자 유무를 판가름하기 위한 비교 범위
				result += binary[hex[i] - '0'];
//				String 타입에서 '+='는 문자열 연결 연산자로
//				문자열을 계속 이어붙인다는 의미
			} else {
				result += binary[hex[i] - 'A' + 10];
			}
		}

		System.out.println("hex: " + new String(hex));
		System.out.println("binary: " + result);
	}
}
// hex배열의 값을 2진수로 변환하는 코드,
// hex : 16진수
// binary : 2진수

/*
 *  parsing(파싱, 문장 분석)하는 코드
 *  
 *  특정 문장이나 문자열을 쪼개서 문자로 만들어, 문자별로 차이값을 비교하는 것
 *  	ex) 'X' - '0' = ?
 *  		대문자 X와 문자로 된 숫자 0의 아스키 코드값의 차이값은 정수 타입인 int로 변환되어나옴
 *  		즉, 차이값은 새로운 문자가 아닌 숫자가 됨
 */

