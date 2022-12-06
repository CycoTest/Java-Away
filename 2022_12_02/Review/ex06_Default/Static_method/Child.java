package ex06_Default.Static_method;

public class Child extends Parent implements MyInterface, MyInterface2 {
	public void method1() {
		System.out.println("method1() in Child"); // 오버라이딩
	}
}
