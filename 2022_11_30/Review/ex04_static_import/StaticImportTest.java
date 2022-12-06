package ex04_static_import;

import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportTest {
	public static void main(String[] args) {
		out.println(random());
//		System.out.println(Math.random());

		out.println("Math.PI : " + PI);
//		System.out.println("Math.PI : " + Math.PI);
	}
}
