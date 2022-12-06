package ex02_Reference.Parameter;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		int x[] = {10};
		System.out.printf("main() : x = %d\n", x[0]);

		change(x);
		System.out.println("After change(x)");
		System.out.printf("main() : x = %d\n", x[0]);
	}

	static void change(int x[]) {
		x[0] = 1000;
		System.out.printf("change() : x = %d\n", x[0]);
	}
}
