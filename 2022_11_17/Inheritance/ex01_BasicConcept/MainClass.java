package ex01_BasicConcept;

public class MainClass {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
		
		B b = new B();
		b.methodA();
		b.methodB();
//		B 클래스가 쓸 수 있는 메소드 중엔 
//		A 클래스에서 생성된 메소드를 모두 다 쓸 수 있음
//		이유? A 클래스가 B 클래스의 부모 클래스로 설정했기 때문
	}
}
