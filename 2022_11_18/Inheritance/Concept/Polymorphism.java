package Concept;

public class Polymorphism {

}
/*
 * 다형성 (Polymorphism)
 * 	- 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
 * 
 * 	- 코드 측면에서 보면 다형성은 하나의 타입에 여러 객체를 대입함으로써
 * 		다양한 기능을 이용할 수 있도록 해줌
 * 	
 *		다형성을 위해 자바는 부모 클래스로 타입 변환(Type Casting)을 허용
 *
 *	1) 매개변수(Parameter)의 다형성
 *		- 참조 타입의 매개변수(parameter)는 메소드에 접근할 때
 *			자신과 같은 타입이거나 혹은 자식 클래스의 타입의 주소를 넘겨준다
 *			
 *			부모 클래스의 파라미터로 접근할 수 있으면 자식 클래스의 타입도 접근 가능
 *			
 *			부모 클래스의 파라미터가 있어서 자식 클래스의 파라미터를 접근하기 때문에
 *			코드가 간단해지는 효과를 가져옴
 *
 *			하지만, 접근할 수 있는 파라미터는 부모 클래스의 멤버변수만 접근이 가능함
 *
 *		ex) ex05_Parameter
 * 
 * 	1) 자동 타입 변환
 * 		- 자식 클래스는 부모 클래스의 특징과 기능을 상속받기 때문에
 * 			부모 클래스와 동일하게 취급될 수 있다는 것
 * 		
 * 		- 형식)
 * 			부모class 변수 = 자식class 타입;
 * 		ex)
 * 		Cat cat = new Cat();
 * 		Animal animal = cat;
 * 
 * 		Animal animal2 = new Cat();
 * 
 * 	ex) ex03, ex04
 * 
 * 		(1) instanceof
 * 			-> 좌항의 객체가 우항의 인스턴스이면,
 * 			즉 우항의 타입으로 객체가 생성되었다면 true, 아니면 false
 * 
 * 			
 * 
 * 			형식: 좌항(객체) instanceof 우항(타입)
 * 			결과: boolean 타입으로 true 혹은 false로 알 수 있다
 * 
 * 			ex) ex06_instanceof
 */

