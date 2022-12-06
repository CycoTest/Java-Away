package concept;

public class Error_Exception {

}
/*
 * 에러(Error)와 예외(Exception) 클래스
 * 
 * 	1) 에러(Error)
 * 		- 컴퓨터 하드웨어의 오동작 or 고장으로 인해 응용프로그램 실행 오류기 
 * 			발생하는 것. 실행 불능 상태가 됨.
 * 			-> 컴파일 에러
 * 
 * 	2) 예외(Exception)
 * 		- 사용자의 잘못된 조작 or 개발자의 잘못된 코딩으로 인해 발생하는
 * 			프로그램 오류
 * 			예외가 발생되면 프로그램은 곧 바로 종료된다는 점에서는 에러와 동일
 * 
 * 			그러나 예외는 예외 처리(Exception Hangling)를 통해
 * 			프로그램을 종료하지 않고 정상 실행 상태가 유지되도록 할 수 있다
 * 
 * 		(1) 일반 예외(Exception)
 * 			-> 자바 소스를 컴파일하는 과정에서 예외 처리 코드가 
 * 				필요한지 검사
 * 				만약, 예외 처리 코드가 없다면 컴파일 오류가 발생
 * 
 * 			ex) ex01_Exception
 * 
 * 		(2) 실행 예외(Runtime Exception)
 * 			-> 컴파일 과정에서 예외 처리 코드를 검사하지 않는 예외
 * 
 * 			ex) ex02_Runtime.Exception
 * 
 */
