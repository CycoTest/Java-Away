package concept;

public class d_String_Class {

}
/*
 * 7. String 클래스
 * 	-> 불변: 선언과 동시에 문자열 내용을 바꾸는 것이 불가하다
 * 
 * 7-1. String 생성자
 * 	
 * 	ex) ex06_String
 * 
 * 7-2. String 메소드 
 * 
 * 	(1) charAt()
 * 		-> 문자열의 특정 자리에 있는 문자를 가져오는 메소드
 * 		-> 괄호 안에 가져오고자 하는 위치에 해당하는 숫자를 넣어주면 됨
 * 
 * 		ex) ex07_charAt
 * 
 *	(2) indexOf()
 *		-> 문자열 내에서 문자열/문자가 있는 자리를 알아내는 메소드
 *		-> 괄호 안에 확인하고자 하는 문자열이 있는 위치를 넣어주면 됨
 *
 *		ex) ex08_indexOf
 * 
 * 	(3) length()
 * 		-> 문자열의 길이를 확인하고자 하는 메소드
 * 
 * 		ex) ex09_length
 * 
 * 	(4) replace()
 * 		-> 문자열 내에서 특정 문자열/문자를 다른 문자열/문자로 바꿔주는 메소드
 * 
 * 		-> 한 번 선언된 String 타입의 변수값은 바꿀 수 없기 때문에,
 * 			해당 메소드로 대체된 문자열은 Heap 영역에 새 메모리 공간을 할당받아 저장된다
 * 
 * 	ex) ex10_replace
 * 	
 * 	(5) subString()
 * 		-> 부분 문자열을 추출하는 메소드
 * 
 * 		a. substring(int beginIndex, int endIndex)
 * 		b. substring(int beginIndex)
 * 
 * 	(6) toLowerCase(), toUpperCase()
 * 		-> 문자열 내의 문자열/문자를 모두 소문자/대문자로 바꿔주는 메소드
 * 
 * 	(7) trim()
 * 		-> 문자열 내에서 문자열의 양옆의 공백을 없애주는 메소드
 * 			즉, 문자열/문자과 문자열/문자 사이에 있는 공백이나 가운데에 있는 공백은 없애주지 못함
 * 
 * 	(8) valueOf()
 * 		-> 해당 변수값의 내용이 변하는 것이 아닌
 * 			해당 변수값의 타입을 String 타입으로 변환하고자 할 때 사용하는 메소드
 * 
 * 	
 * 
 */
