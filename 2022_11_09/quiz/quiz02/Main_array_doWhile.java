package quiz02;

import java.util.Scanner;

public class Main_array_doWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[6];
		int i = 0;
		do {
			arr[i] = sc.nextInt();
		} while (++i < arr.length);
		sc.close();

		int Max = arr[0]; 
//		int Max = Integer.MIN_VALUE;로 적어도 됨
		int Min = arr[0];
//		int Min = Integer.MAX_VALUE;로 적어도 됨
		int j = 0;
		do {
			if (Max <= arr[j]) {
				Max = arr[j];
			} else if (Min >= arr[j]) {
				Min = arr[j];
			} else {
				continue;
			}
		} while (++j < arr.length);
		System.out.printf("max : %d\nmin : %d", Max, Min);
	}
}
// Q: 6개의 정수를 입력 후 최소값과 최대값