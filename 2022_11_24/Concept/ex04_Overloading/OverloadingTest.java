package ex04_Overloading;

public class OverloadingTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();

		System.out.printf("mm.add(3, 3) 결과: %d\n", mm.add(3, 3));
		System.out.printf("mm.add(3L, 3) 결과: %d\n", mm.add(3L, 3));
		System.out.printf("mm.add(3, 3L) 결과: %d\n", mm.add(3, 3L));
		System.out.printf("mm.add(3L, 3L) 결과: %d\n", mm.add(3L, 3L));

		int a[] = { 100, 200, 300 };
		System.out.printf("mm.add(a) 결과: %d\n", mm.add(a));
	}
}
