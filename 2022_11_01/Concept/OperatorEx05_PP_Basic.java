public class OperatorEx05_PP_Basic {
	public static void main(String[] args) {
		int x = 5;
		int y = 8;
		int result1 = ++x + 10;
		// x + 1 = 6, x = 6 out
		// 6 + 10 = result1 out
		int result2 = y++ + 10;
		// y = 8
		// 8 + 10 = result2 out
		// y + 1 = 9, y = 9 out
		
		System.out.println(x);
// ++x 연산에 의해, x값은 출력 전에 연산이 들어가서 6
		System.out.println(y);
// result2 연산이 끝나고 y++ 연산이 들어갔기 때문에, 9
		System.out.println(result1);
		System.out.println(result2);
	}
}
