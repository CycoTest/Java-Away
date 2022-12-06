package ex02_Method_Class.Instance;

public class MyMathTest {
	public static void main(String[] args) {
//		클래스 메소드 호출, 인스턴스 생성없이 호출 가능
		System.out.println(MyMath.add(200L, 100L));
		System.out.println(MyMath.subtract(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.divide(200L, 100L));

		System.out.println();
		
		MyMath mm = new MyMath(); // 인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;

//		인스턴스 메소드는 객체 생성 후에만 호출이 가능
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
