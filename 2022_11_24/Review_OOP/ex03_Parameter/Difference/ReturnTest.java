package ex03_Parameter.Difference;

public class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add(3, 5);
		System.out.println(result);

		int result2[] = { 0 };
		r.add(3, 5, result2);
		System.out.println(result2[0]);
	}

	private int add(int a, int b) {
		return a + b;
//		return은 오직 하나의 값만 반환 가능
	}

	private void add(int a, int b, int result[]) {
		result[0] = a + b;
//		여러 개의 값을 넘기고 싶을 때, reference 타입을 쓴다
	}
}
