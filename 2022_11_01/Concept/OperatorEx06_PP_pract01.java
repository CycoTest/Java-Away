public class OperatorEx06_PP_pract01 {
	public static void main(String[] args) {
		int x = 5;
		int y = 8;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		int z = ++x + y++;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}
}