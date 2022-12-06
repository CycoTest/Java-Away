package ex23_auto.Boxing.Unboxing;

public class Main {
	public static void main(String[] args) {
//		자동 Boxing
		Integer obj = 100;
		System.out.printf("value : %d\n", obj.intValue());

//		대입 시 자동 Unboxing
		int value = obj;
		System.out.printf("value : %d\n", value);

//		연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.printf("result : %d\n", result);
	}
}
