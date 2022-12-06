package object_oriented;

public class Method {

	int plus (int x, int y) {
		int result = x + y;
		
		return result;
//		return를 만나면, 해당 메소드를 호출했던 라인으로 점프한다
//		고로, return 아래 라인에 적힌 코드는 실행될 수가 없다
		
//		System.out.println(result); // Unreachable code
	}
	public static void main(String[] args) {
		
	}

}
/*
 * 메소드(method)
 * 	- 객체의 동작
 * 	- 객체 간의 데이터 전달의 수단
 * 
 * 메소드 선언
 * 	리턴 타입  메소드 이름 (매개 변수, ...) {
 * 		실행할 코드
 * 	}
 *  -> 괄호()가 메소드
 * 
 * 리턴 타입
 * 	- 메소드가 실행 후 리턴하는 값의 타입
 * 	- 리턴 값이 없는 경우 : void
 */
