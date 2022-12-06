package concept_examples;
public class stringClass_method {
	public static void main(String[] args) {
		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "): " + ch);
		}

		char[] chArr = src.toCharArray();

		System.out.println(chArr);
	}
}
/*
 * 문자열 = 문자들의 집합 = char 배열
 * 
 * 자바에서 char배열이 아닌 String 클래스를 이용해서 문자열을 처리하는 이유
 * 	-> String 클래스가 char 배열에 여러 가지 기능을 추가하여 확장한 것이기 때문
 *  
 *  => String 클래스 = char 클래스 + 기능(메서드)
 * 
 * 	-> C언어에서는 문자열을 char배열로 다루지만,
 * 	객체지향언어닌 자바에서는 char배열과 그에 관련된 기능들을 함께 묶어서 클래스에 정의한다.
 * 
 * 	객체지향개념이 나오기 이전의 언어들은 데이터와 기능을 따로 다뤘지만,
 * 	객체지향언어에서는 데이터와 그에 관련된 기능을 하나의 클래스에 묶어서 다룰 수 있게 한다.
 * 	즉, 서로 관련된 것들끼리 데이터와 기능을 구분하지 않고 함께 묶는 것이다.
 * 
 * 	여기서 말하는 '기능'은 함수를 의미하며, 
 * 	'메서드'는 객체지향 언어에서 '함수' 대신 사용하는 용어일 뿐 함수와 같은 뜻이다
 * 
 * 	char배열과 String클래스의 한 가지 중요한 차이가 있는데,
 * 	String 객체(문자열)는 읽을 수만 있을 뿐 내용을 변경할 수 없다는 것이다
 * 		
 * ex)
 * 		String str = "Java";
 * 		str = str += "8";
 * 		System.out.println(str);
 * 	
 * 	이럴 경우, 출력값은 "Java8"이 된다. 
 * 	이는 "Java"의 문자열 내용에 "8"이라는 문자열이 추가되어 기존의 "Java" 문자열의 내용이 변화한 것이 아닌,
 * 	"Java8"이라는 새로운 내용의 문자열이 새로 생성되는 것이다.
 * 
 * String 클래스의 메서드
 * 	1) char charAt(int index) 
 * 		-> 문자열에서 해당 위치(index)에 있는 문자를 반환한다
 * 	2) int length()
 * 		-> 문자열의 길이를 반환한다
 * 	3) String substirng(int from, int to)
 * 		-> 문자열에서 해당 범위(from ~ to)에 있는 문자열을 반환한다
 * 			(to 범위에 포함되지 않음)
 * 	4) boolean equals(Object obj)
 * 		-> 문자열의 내용이 obj와 같은지 확인
 * 		-> 같으면 true, 다르면 false
 * 	5) char[] toCharArray()
 * 		-> 문자열을 문자배열(char[])로 변환해서 반환한다
 * 
 * 
 * 변수명과 함수를 구분하는 법
 * 	-> 변수명.함수
 * 	-> 이렇게 구성되어 있음 
 */
