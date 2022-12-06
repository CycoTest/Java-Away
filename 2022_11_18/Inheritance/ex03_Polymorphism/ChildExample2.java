package ex03_Polymorphism;

public class ChildExample2 {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();

		parent.method1();
		parent.method2();
//		parent.method3(); // 호출 불가능

		child.method1();
		child.method2();
		child.method3();

		System.out.println("===============");

		parent = child;
//		레퍼런스 변수 child에 들어간 주소값을 레퍼런스 변수 parent에 넣는다 
		parent.method1();
		parent.method2();
	}

}
