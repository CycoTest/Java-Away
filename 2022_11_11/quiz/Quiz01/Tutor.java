package Quiz01;

import java.util.Scanner;

public class Tutor {
	public static void main(String[] args) {
		int[] num = new int[3];
		boolean eq = true;

		do {
			eq = false;
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 10);
			}

			if (num[0] == num[1] || num[1] == num[2] || num[2] == num[0]) {
				eq = true;
			}
		} while (eq);

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];
		boolean b = false;
		int str, bl;
		do {
			str = 0;
			bl = 0;
			b = true;
			System.out.print("Input number... ");
			for (int i = 0; i < inp.length; i++) {
				inp[i] = sc.nextInt();
			}

			for (int i = 0; i < inp.length; i++) { // strike check
				if (num[i] == inp[i]) {
					str++;
				}
			}

			for (int i = 0; i < inp.length; i++) { // ball check
				for (int j = 0; j < inp.length; j++) {
					if (num[i] == inp[i] && i != j) {
						bl++;
					}
				}
			}

			System.out.println("strike : " + str + ", ball : " + bl);
			if (str == 0 && bl == 0) {
				System.out.println("OUT!");
			}

			if (str == 3) {
				b = false;
			}
		} while (b);
		sc.close();
	}
}
