public class ForSumEx01 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i; // Sum = sum + i 의 줄임말
		}
		
		System.out.println("sum = " + sum);
	}
}
