package ex22_Wrapper.Boxing.Unboxing;

public class Main {
	public static void main(String[] args) {
//		Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		Integer obj4 = 100;
//		6,7번 라인과 같은 사용법은 비추
//		8,9번 라인과 같은 사용법을 권장
		
//		Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}
}
