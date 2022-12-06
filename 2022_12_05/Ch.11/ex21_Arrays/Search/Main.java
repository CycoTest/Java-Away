package ex21_Arrays.Search;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] = %d\n", i, scores[i]);
		}

		int index = Arrays.binarySearch(scores, 99);
		System.out.printf("index : %d\n", index);
	}
}
