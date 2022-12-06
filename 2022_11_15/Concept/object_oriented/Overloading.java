package object_oriented;

public class Overloading {
	Overloading() {}
	Overloading(String model) {}
	Overloading(int maxSpeed) {}
	Overloading(String model, String color) {}
	Overloading(String model, String color, int maxSpeed) {}
}
/*
 * 생성자 오버로딩(Overloading)
 * 	- 일반적으로 생성자를 중복 선언하면 컴파일 에러가 발생한다
 * 		만약 생성자 내 파라미터가 다를시,
 * 		생성자의 이름은 같지만 파라미터가 다르기 때문에 다른 생성자로 인식한다
 * 
 * 	- 매개 변수의 타입과 개수, 선언된 순서로 생성자(Constructor) method를 구분
 * 		ex) 위의 코드에서 생성자는 파라미터(범위/한도)가 다 다르므로, 각각의 생성자로서 선언된 것이다
 * 			고로, 생성자는 총 5개인 셈이다.
 * 				+ 파라미터 : 생성자 이름(파라미터)
 * 	
 * 	- 생성자를 중복해서 만들지 못하는 경우
 * 		-> 생성자 파라미터에 변수 타입의 총 갯수가 동일할 때
 * 		
 * 		ex) 
 * 			Overloading(String x, String y) {} 
 * 			Overloading(String X, String Y) {}
 * 			=> String 타입으로 선언한 변수명이 중요한 게 아니라, 
 * 				선언된 String 타입과 String 타입의 개수 그리고, 선언된 순서로 생성자를 구분한다
 */
