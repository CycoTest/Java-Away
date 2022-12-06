package Quiz01;

import java.util.Random;
import java.util.Scanner;

public class numberBaseballGame {
	public static void main(String[] args) {

//		중복 없는 난수 생성
		int num[] = new int[3];
		int c[] = new int[3]; // c = catch
		Random rd = new Random();

		for (int i = 0; i < c.length; i++) {
			c[i] = rd.nextInt(9) + 0;
			for (int j = 0; j < i; j++) {
				if (c[i] == c[j]) {
					i--;
				}
			}
			System.out.print(c[i] + " ");
		}

		Scanner sc = new Scanner(System.in);
		int freq;
		int strike;
		int ball;
		while (true) {
			freq = 0;
			strike = 0;
			ball = 0;
			for (int i = 0; i < c.length; i++) {
				num[i] = sc.nextInt();
				if (num[i] > 9 || num[i] < 0) {
					System.out.println("입력 가능 범위는 0 ~ 9까지 입니다.");
				}

			}

			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					if (c[i] == num[j] && i == j) {
						strike++;
					} else if (c[i] == num[j] && i != j) {
						ball++;
					}
				}
			}

			if (strike == 0 && ball == 0) {
				System.out.println("OUT!!");
			} else {
				System.out.printf("%d Strike %d Ball", strike, ball);
			}
			freq++; // frequency

			if (strike == 3) {
				System.out.printf("\nGAME OVER\n You've tried %d times.", freq);
				break;
			}
		}
		sc.close();
	}
}

/*
 * Q: 숫자 야구 게임
 * 
 * 1) 0 ~ 9 정수 3개를 난수로 생성 
 * 2) 사용자 3개의 숫자 입력 
 * 3) 같은 위치에 있으면 Strike, 숫자가 존재하지만 다른 위치에 있으면 Ball 
 * 4) 숫자가 전혀 겹치지 않으면 Out, 다 맞으면 Game Over
 */
