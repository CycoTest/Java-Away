package ex01_Primitive.Parameter;

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.printf("main() : x = %d\n", d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.printf("main() : x = %d\n", d.x);
	}

	static void change(int x) {
		x = 1000;
		System.out.printf("change() : x = %d\n", x);
	}
}
/*
 * 기본형 매개변수 = 변수의 값을 읽기만 할 수 있다
 * -> read only
 * 
 * 참조형 매개변수 = 변수의 값을 읽고 변경할 수 있다
 * -> read & write
 * 
 * 
 * 
 */

