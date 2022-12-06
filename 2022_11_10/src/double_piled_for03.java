public class double_piled_for03 {
	public static void main(String[] args) {
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=5; j++) {
//				if (i==j) {
//					System.out.printf("[%d, %d]", i, j);
//				} else {
//					System.out.printf("%5c", ' ');
//				}
//			}
//			System.out.println();
//		}		
		int i = 0;
		do {
			i++;
			int j = 0;
			do {
				j++;
				if (i == j) {
					System.out.printf("[%d, %d]", i, j);
				} else {
					System.out.printf("%5c", ' '); // 디버깅할 때, 확인을 위해서 공백 대신에 ?을 넣어서 확인
				}
			} while (j < 5);
			System.out.println();

		} while (i < 5);
	}
}
