public class SwitchQ01 {
	public static void main(String[] args) {
		// Q1: 1 ~ 99까지의 정수를 출력하는 프로그램을 작성하시오
		int n1 = (int)(Math.random()*99)+1;
		
		// 0.0 <= M < 1.0
		// 0.0 <= M*99 < 99.0
		// 0 <= (int)M*99 < 99
		// 1 <= (int)M*99+1 < 100
		
		System.out.println(n1);
		
		// Q2: 0.0 ~ 0.99까지의 실수를 출력하는 프로그램을 작성하시오
		// 소수점 2자리
		double n2 = Math.random();
				
		// 0.0 <= M < 1.0
				
		System.out.printf("%.2f", n2);
	}

}
