package ex06_Type.Casting_Polymorphism;

public class InterfaceTest3 {
	public static void main(String[] args) {
//		In3 in3 = new In3();
//		Cannot instantiate the type In3
		ExtendsTest et = new ExtendsTest();
		
		et.in1Method();
		et.in2Method();
		
		System.out.println(In1.x);
		System.out.println(In2.x);
//		System.out.println(In3.x);
//		The field In3.x is ambiguous
//		In3가 상속받은 변수 x값은 부모 클래스격인 In1과 In2 둘 다 있다
//		따라서, 상속받은 변수 x값 중 어떤 것을 출력해야 할지 혼동이 오기 때문
	}
}
//	인터페이스는 일반 변수는 선언할 수 없고, 상수만 선언할 수 있다