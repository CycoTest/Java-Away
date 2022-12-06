package ex04_Interface.indirectAccess;

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B()); // void autoPlay(I i) 호출
		a.autoPlay(new C()); // void autoPlay(I i) 호출
	}
}
