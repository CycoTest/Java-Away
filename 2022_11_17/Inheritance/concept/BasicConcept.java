package concept;
public class BasicConcept {

	public static void main(String[] args) {

	}
}
/*
 * 상속(Inheritance)
 * 
 * 부모 클래스 : (field + method)
 * 
 * 자식 클래스 : (field + method) + field + method 
 * 
 * 
 * 1) 기본 형식
 * 
 * public class 자식 클래스 extends 부모 클래스 {
 * 	// 필드
 *	// 메소드
 * }
 * 
 * 장점: 코드의 중복을 줄여준다
 * 		ex) ex01, ex02
 * 
 * 2) 자바는 다중 상속을 허용 X
 * 
 * 부모 클래스1 A, int d = 10;
 * 부모 클래스2 B, int d = 30;
 * 
 * 자식 클래스 C, int d = ? <- 모호하다
 * 
 * 하지만, C++에선 다중 상속을 허용
 * 
 * + Object : 자바의 최상위 class
 * 	-> 자바의 모든 클래스들은 Object 클래스한테 상속받고 있음
 */
