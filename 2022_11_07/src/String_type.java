public class String_type {
	public static void main(java.lang.String[] args) {
		String strVar1 = "JBEdu";
		String strVar2 = "JBEdu";
		
		if (strVar1 == strVar2) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("두 문자열이 같음");
		}
		
		String strVar3 = new String("JBEdu");
		String strVar4 = new String("JBEdu");
		
		if (strVar3 == strVar4) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("두 문자열이 같음");
		}
	}
}
/*
 * 기본 타입
 * 	- 실제값이 Stack에 저장됨
 * 
 * 참조 타입
 * 	- 주소값이 Stack에 저장되고, 실제값은 Heap에 저장됨
 * 	
 * Queue : FIFO, 선입선출
 * 
 * 
 * + String 타입
 * 
 * String 변수; = String 타입의 레퍼런스 변수 선언
 * 변수 = "문자열"; = 문자열의 실제값이 Heap 영역에 저장
 * String 변수 = "문자열"; = 
 * 
 * 
 * String name1 = new String("Java");
 * String name2 = new String("Java");
 * 	- new : Heap 영역에서 메모리 공간을 할당받는다
 * 	- String("Java") : Heap 영역에서 Java 라는 이름의 메모리 공간을 할당받는데, String 타입으로 받음
 * 	- name1 = : Heap 영역에서 String 타입으로 된 Java 라는 이름의 메모리 공간을 할당받으면서 얻은 주소값을 대입함
 * 	- name2 = : Heap 영역에서 String 타입으로 된 Java 라는 이름의 메모리 공간을 할당받으면서 얻은 주소값을 대입함
 * 		-> name1과 name2에 대입된 Heap 영역 내 "Java"라는 문자열의 주소값이 각각 다름
 * 
 * String name1 = "Java";
 * String name2 = "Java";
 * 	- "Java" : Heap 영역에 Java 라는 이름의 메모리 공간을 String 타입으로 할당받음
 * 	- name1과 name2에 대입된 Heap 영역 내 Java라는 문자열의 주소값이 동일함
 * 
 * 
 * 문자열 만을 비교하려면, equals()
 * 동일한 객체인지 비교하려면, '=='
 */
