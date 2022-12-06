package multi_dimensional_arrays;

import java.util.Scanner;

public class question_and_answer {
	public static void main(String[] args) {
		String[][] words = { 
				{ "chair", "의자" },
				{ "computer", "컴퓨터" },
				{ "integer", "정수" }
				};

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d, %s의 뜻은? ", i + 1, words[i][0]);

			String tmp = sc.nextLine();

			if (tmp.equals(words[i][1])) { 
//			.equals() : heap 영역에 있는 객체가 같은 객체인지 확인하기 위한 메서드
				System.out.printf("정답입니다.\n\n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다\n\n", words[i][1]);
			}
		}
		sc.close();
	}
}
