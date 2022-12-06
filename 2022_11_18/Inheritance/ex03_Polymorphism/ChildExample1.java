package ex03_Polymorphism;

public class ChildExample1 {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();

		parent.method1();
		parent.method2();
//		parent.method3(); // 호출 불가능
//		the method method3() is undefined for the type Parent

		child.method1();
//		Child 클래스에서 선언한 적이 없는 메소드이기 때문에
//		Parent 클래스에서 상속된 메소드를 불러와서 호출
		child.method2();
		child.method3();
	}

}
