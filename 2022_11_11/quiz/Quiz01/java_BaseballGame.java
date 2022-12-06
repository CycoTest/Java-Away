package Quiz01;

import java.util.Scanner;

public class java_BaseballGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cN[] = new int[3]; // c : computer number
		int pN[] = new int[3]; // n : player number

		for (int i = 0; i < cN.length; i++) {
			cN[i] = (int) (Math.random() * 10);
			if (i > 1 && cN[i] == cN[0]) {
				i--;
			} else if (i > 1 && cN[i] == cN[1]) {
				i--;
			}
		}
		int strike = 0;
		int ball = 0;
		int count = 0;
		int a = 0; // do-while 초기값 선언
		do {
			pN[a] = sc.nextInt();
			for (int i = 0; i < pN.length; i++) {
				if (pN[a] == cN[i] && a == i) {
					strike++;
				} else if (pN[a] == cN[i] && a != i) {
					ball++;
				}
			}

			if (strike == 0 && ball == 0) {
				System.out.print("OUT!\n");
			} else if (strike == 3 && ball == 3) {
				System.out.printf("Congrat! You win! You've tried %d time!\n", count);
				break;
			} else {
				System.out.printf("%d Strike! %d Ball!\n", strike, ball);				
			}
			count++;

		} while (true);
	}

}
