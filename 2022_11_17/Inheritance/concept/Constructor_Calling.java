package concept;
public class Constructor_Calling {

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
 * 3) 생성자(Constructor)
 * 	- 호출 순서
 * 		: Main 클래스에서 변수값에 대한 호출을 하면,
 *			자식 클래스 -> 부모 클래스 -> 자식 클래스
 * 		ex) ex03
 * 
 * 4) 부모 생성자의 명시적 호출
 * 	- 호출 순서
 * 		: Main 클래스에서 변수값에 대한 호출을 하면,
 * 			Main 클래스 -> 부모 클래스 -> 자식 클래스
 * 
 * 	- super
 * 		: 부모 클래스의 생성자를 호출
 * 		super(String variable, String variable) 
 * 		=> 부모 클래스의 생성자 중 파라미터가 String, String인 생성자를 호출
 * 		ex) ex04
 * 
 * 
 * 
 */
