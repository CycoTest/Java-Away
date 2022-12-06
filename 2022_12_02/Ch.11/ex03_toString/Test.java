package ex03_toString;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();

		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj2.toString());
	}
}
