public class ContinueEx01 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				continue;

			System.out.println(i);
		}
	}
}
/*
 * continue문
 * 
 * loop([조건식]) {
 * 
 * 	(1)
 * 	continue;
 * 
 * 	(2)
 * 
 * };
 */
