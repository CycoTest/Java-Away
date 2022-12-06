package ex20_Arrays.sort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] = %d\n", i, scores[i]);
		}

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.printf("names[%d] = %s\n", i, names[i]);
		}
	}
}
