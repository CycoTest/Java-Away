package concept;

public class c_Class_Class {

}
/*
 * 6. Class 클래스
 * 	
 * 6-1. Class 객체 얻기: getClass(), forName()
 * 	-> Class를 구분지어주는 역할을 하는 것은 패키지다
 * 		클래스명이 동일한 것들이 여러 개인데 한 번도 컴파일 오류가 일어나지 않는다
 * 		
 * 		이는, 클래스의 객체명이 패키지에 따라 구분지어져서, 패키지명.클래스명으로 저장되기 때문
 * 
 * 	ex) ex04_Class.Class
 * 
 * 6-2. 리플렉션: 
 * 	getDeclaredConstructors(), getDeclaredFields(), getDeclaredMethods()
 * 	
 * 	-> 선언된 생성자, 필드, 메소드의 정보를 가져온다
 * 	
 * 	-> 만약 선언된 생성자, 필드, 메소드가 여러 개고 이것들을 배열로 불러들어온다면,
 * 		개발자가 선언한 순서대로 배열에 들어가지 않고
 * 		컴파일러가 랜덤하게 저장하기 때문에 출력값이 항상 일정하게 나오지 않는다
 * 
 * 	ex) ex05_reflection.get	
 * 
 * 
 * 
 */ 
