public class pi_math {
	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi*1000) / 1000f;
		
		System.out.println(shortPi);
		
		System.out.println(Math.PI); // PI, 대문자인 이유 = 상수
	}
}
