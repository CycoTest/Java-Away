package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Main_doWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double darr[] = new double[6];

		int i = 0;
		do {
			darr[i++] = sc.nextDouble();
		} while (i < darr.length);
		sc.close();

		Arrays.sort(darr);

		double dArr[] = new double[6];

		int j = 0;
		do {
			i = i - 1; // 마지막에 저장된 i 값은 6이다
			dArr[j++] = darr[i];
		} while (i > 0 && j < darr.length);
//		Arrays.sort(darr, Collections.reverseOrder());
//		위 명령어로 역순 재정렬이 한 방에 가능
		
		j = 0;
		do {
			System.out.print(dArr[j++] + " ");
		} while (j < darr.length);
	}
}
