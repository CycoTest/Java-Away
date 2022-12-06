package ex02_Instance.Member.Class;

public class A {
	class B {
		B() {}		// 생성자
		int field1;		// 인스턴스 필드
		static int field2;		// 정적 필드(X)
		
		void method1() {		// 인스턴스 메소드
			System.out.println("class B - method1()");
		}
		
		static void method2() {}	// 정적 메소드(X)
	}
}
