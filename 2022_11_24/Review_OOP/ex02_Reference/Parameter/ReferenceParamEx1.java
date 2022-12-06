package ex02_Reference.Parameter;

import ex01_Primitive.Parameter.Data;

public class ReferenceParamEx1 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.printf("main() : x = %d\n", d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.printf("main() : x = %d\n", d.x);
	}

	static void change(Data d) {
		d.x = 1000;
		System.out.printf("change() : x = %d\n", d.x);
	}
}
