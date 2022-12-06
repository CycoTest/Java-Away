package multi_dimensional_arrays;
import java.util.Scanner;

public class finding_mine {
	public static void main(String[] args) {
		final int SIZE = 10;
//		변수명이 모두 대문자일 때 = 상수
//		변수명을 강제로 상수로 만들어주는 명령어: final
		int x =0, y=0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
//		 1  2  3  4  5  6  7  8  9
		{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 1
		{1, 1, 1, 1, 0, 0, 1, 0, 0}, // 2
		{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 3
		{0, 0, 0, 0, 0, 0, 1, 0, 0}, // 4
		{0, 0, 0, 0, 0, 0, 0, 0, 0}, // 5
		{1, 1, 0, 1, 0, 0, 0, 0, 0}, // 6
		{0, 0, 0, 1, 0, 0 ,0, 0, 0}, // 7
		{0, 0, 0, 1, 0, 0 ,0 ,0, 0}, // 8
		{0, 0, 0, 0, 0, 1, 1, 1, 0}  // 9
		};
		
		for (int i = 0; i < SIZE; i++) {
			board[0][i] = board[i][0] = (char) (i + '0');
//			x - '0' : 아스키 코드 차이값으로 입력하는 값의 타입을 '정수'로 지정
//			x + '0' : 아스키 코드 차이값으로 입력하는 값의 타입을 '문자'로 지정
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("좌표를 입력하세요.(종료는 00)>");
			String input = sc.nextLine();

			if (input.length() == 2) { // 입력값이 두 자릿수일 때
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';

				if (x == 0 && y == 0) {
					break;
				}
			}

			if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}

			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

			for (int i = 0; i < SIZE; i++) {
				System.out.println(board[i]);
			}
			System.out.println();
		}
		sc.close();
	}
}
