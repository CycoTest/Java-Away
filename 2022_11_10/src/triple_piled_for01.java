
public class triple_piled_for01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 3; k++) {
					System.out.println("" + i + j + k); 
//					출력값이 문자열로 나와야 하기에, 문자열 연결 연산을 위해 문자열을 하나 삽입
				}
				System.out.println("----");
				if (i > j) {
					System.out.println("----");					
				}
			}
			System.out.println("====");
		}
	}
}
