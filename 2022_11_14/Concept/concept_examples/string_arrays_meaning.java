package concept_examples;
public class string_arrays_meaning {
	public static void main(String[] args) {
		String[] names = { "Kim", "Park", "Yi" };

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]: " + names[i]);
		}

		String tmp = names[2];
		System.out.println("tmp: " + tmp);

		for (String str : names) {
			System.out.println(str);
		}
	}
}
/*
 * String 배열
 * 
 * String 타입의 변수 선언과 배열 변수 선언의 차이
 * 
 * + String 타입의 경우
 * 	-> stack 영역에 String 타입의 변수값이 저장
 * 	-> heap 영역에 String 타입의 변수의 실제값과 주소값 둘 다 저장
 * 
 * 따라서, String s1 = new String("A");의 의미는
 * 	-> stack 영역에 String 타입의 변수 s1의 변수값이 저장
 * 	-> heap 영역에 문자열 "A"에 대한 새 메모리 공간을 할당받음
 * 	-> s1에 heap 영역에 할당된 문자열 "A"의 실제값을 빌려온다
 * 
 *  
 * + String 배열의 경우
 * 	-> stack 영역에 String 배열 타입의 변수값이 저장
 * 	-> heap 영역에 객체 값이 없는 String 배열의 주소값이 저장
 * 	-> heap 영역에 각 객체들의 실제값은 각각 따로 메모리 공간을 할당받아 저장, 그리고 이게 실제값
 * 
 * 따라서, String[] s1 = new String[3] { "A", "B", "C"};
 * 	-> stack 영역에 String 배열 변수 s1의 변수값이 저장
 * 	-> heap 영역에 값이 없는 3칸짜리 String 배열 변수의 메모리 공간을 새로 할당받음
 * 		-> 또한, 3칸짜리 String 배열 변수의 주소값이 저장
 * 	-> heap 영역에 문자열 A, B, C가 개개별로 메모리 공간을 따로 할당받음
 * 		-> 문자열 A, B, C의 실제값이 여기에 저장
 * 
 * 그럼 String 배열의 작동 원리는
 * 	-> heap 영역에 할당된 3칸짜리 String 배열의 각 객체별 값에는 따로 저장된 문자열 A, B, C의 실제값을 빌려와서 저장
 * 	-> String 배열 변수인 s1에는 각각의 문자열의 실제값을 빌려와서 저장하는 것이 아닌
 * 		문자열 실제값이 저장된 3칸짜리 String 배열의 각 객체별 주소값을 빌려와서 저장하는 것
 *		
 * 참조 변수 String과 비교하면, 참조 배열 변수 String은 heap 영역 안에 2가지의 메모리 공간을 할당받고 
 * 이를 연결하는 이른바 2중 연결인 셈이다
 * 
 * 
 * 위의 예제를 디버깅(debugging)해 보면, 
 * String 타입의 배열 변수 names의 각각 객체에 저장된 문자열과 각 문자열들은 문자로 쪼개어져 저장된 또 다른 배열 변수가 나옴을 알 수 있다
 * 		-> 이 경우엔 위의 개념을 적용하면 3중 연결이 되는 것이다
 */
