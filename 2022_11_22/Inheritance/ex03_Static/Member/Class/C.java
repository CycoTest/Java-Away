package ex03_Static.Member.Class;

public class C {
	static class D {
		D() {} // 생성자

		int field1; // 인스턴스 필드
		static int field2; // 정적 필드

		void method1() { // 인스턴스 메소드
			System.out.println("class D - method1()");
		}

		static void method2() {} // 정적 메소드
	}
}
