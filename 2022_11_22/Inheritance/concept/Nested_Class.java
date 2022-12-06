package concept;

public class Nested_Class {

}
/*
 * 중첩 클래스 (Nested Class)
 * 	- 클래스 내부에 선언한 클래스
 * 	- 중첩 클래스를 사용하면 두 클래스의 멤버들을 
 * 		서로 쉽게 접근할 수 있다는 장점과
 * 		외부에는 불필요한 관계 클래스를 감춤으로써 
 * 		코드의 복잡성을 줄일 수 있다
 * 
 *  형식 1:
 *  class OuterClass {
 *  	class InnerClass {
 *  
 *  	}
 *  }
 *  
 *  형식 2:
 *  class ClassName {
 *  	interface NestedInterfaceName {
 *  
 *  	}
 *  }
 *  
 *  1) 중첩 클래스의 종류
 * 		- 선언 위치에 따른 분류: 
 * 		-> 멤버 클래스(인스턴스 멤버 클래스 / 정적 멤버 클래스)
 * 		-> 로컬 클래스
 * 
 *  	(1) 멤버 클래스
 *  		a. 인스턴스 멤버 클래스
 *  		=> A 객체를 생성해야만 사용할 수 있는 B 중첩 클래스
 *  
 *  		형식:
 *  		class A {
 *  			class B {...}
 *  		}
 *  
 *  		b. 정적 멤버 클래스
 *  		=> A 클르새로 바로 접근할 수 있는 B 중첩 클래스
 *  
 *   		형식:
 *   		class A {
 *   			static class B {...}
 *   		}
 *   
 *   	(2) 로컬 클래스
 *   		=> Method()가 실행할 때만 사용할 수 있는 B 중첩 클래스
 *   
 *   		형식:
 *   		class A {
 *   			void method() {
 *   				class B {...}
 *   			}
 *   		}
 * 
 * 
 */
