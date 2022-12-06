package concept;
public class Method_Override {

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
 * 5) 메소드 재정의(Method Override)
 * 	- 부모로부터 상속받은 메소드를 
 * 		자식 클래스에서 자기 자신 클래스의 기능에 적합하도록 
 * 		재정의하는 기능
 * 
 * 	=> 부모 클래스와 자식 클래스에서 동일한 조건(메소드명, 리턴 타입, 파라미터)의 메소드를 사용시,
 * 		부모 클래스의 메소드는 은닉되고
 * 		자식 클래스의 재정의된 메소드만 호출된다
 * 		ex) ex05_overriding1
 * 
 * 		만약 부모 클래스의 메소드를 호출하고 싶다면, 
 * 		super.메소드명 으로 호출이 가능
 * 		ex) ex06_overriding2
 * 		
 * 	--> 자식 클래스에서 부모 클래스의 메소드를 수정해야 할 때 사용됨
 * 		일반 클래스의 상속 관계에는 많이 사용되지 않은 편이고,
 * 		추상 클래스나 인터페이스에서 필수적으로 사용되는 개념
 */
