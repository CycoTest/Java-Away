package Concept;

public class Protected {

}
/*
 * protected 접근 제한자
 * 	-> 필드, 생성자, 메소드
 * 
 * 	-> 자식 클래스가 아닌 다른 패키지에 소속된 클래스는
 * 		protected가 걸려있는 클래스 내 데이터를 가져다 쓸 수 없다
 * 
 * 		만약 다른 패키지 내의 클래스가 
 * 		protected가 걸려있는 클래스의 데이터를 갖고 싶으면
 * 		
 * 		import 키워드를 써서 protected가 걸려있는 클래스가 속한 패키지를 불러오면
 * 		사용이 가능하다
 * 		
 * 		형식)
 *  	import (protected가 걸려있는 클래스가 속한 패키지명).(protected가 걸려있는 클래스명)
 * 		
 * 		ex) ex01_package1, package2
 * 
 * + 접근 제한자 종류
 * 
 *  1) public
 *  	- 적용할 내용 => 클래스, 필드, 생성자, 메소드
 * 
 * 		- 접근할 수 없는 클래스
 * 		=> 없음
 * 
 * 	2) protected
 * 		- 적용할 내용 => 필드, 생성자, 메소드
 * 
 * 		- 접근할 수 없는 클래스
 * 		=> 자식 클래스가 아닌 
 * 			다른 패키지에 소속된 클래스
 * 
 * 	3) default
 * 		- 적용할 내용 => 클래스, 필드, 생성자, 메소드
 * 
 * 		- 접근할 수 없는 클래스
 * 		=> 다른 패키지에 소속된 클래스
 * 	
 * 	4) private
 * 		- 적용할 내용 => 필드, 생성자, 메소드
 * 
 * 		- 접근할 수 없는 클래스
 * 		=> 모든 외부 클래스
 * 
 */
