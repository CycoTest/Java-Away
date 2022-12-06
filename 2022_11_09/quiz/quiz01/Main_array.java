package quiz01;

import java.util.Scanner;

public class Main_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double arr[] = new double[5];
		int i = 0;
		do {
			arr[i++] = sc.nextDouble();
		} while (i < arr.length);
		sc.close();
		
		double sum = 0.0;
		double avg = 0.0;
		
		int j = 0;
		do {
			sum += arr[j++];
		} while (j < arr.length);
		avg = sum / arr.length;

		System.out.printf("%.1f\n%.2f", sum, avg);
	}
}
/*
 * Q: 5개의 숫자 입력 후 합계 및 평균을 출력
 * 
 * 5개의 숫자: 12.3 36.5 6.7 2.0 71.3
 */
