public class flow_while03 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while ((sum += ++i) <= 100) { 
//			sum += ++i --> sum = sum + ++i
//			1) ++i
//			2) sum + ++i
//			3) sum = sum + ++i
			System.out.printf("%d - %d\n", i, sum);
		}
	}
}
