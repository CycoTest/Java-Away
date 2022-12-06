package quiz01;

import java.util.Scanner;

public class Main_doWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num = 0.0;
		int count = 0;
		double sum = 0.0;
		double avg = 0.0;
		
		do {
			num = sc.nextDouble();
			sum += num;
			++count;
		} while (count < 5);
		sc.close();
		avg = sum / count;
		
		System.out.printf("sum = %.1f\n avg = %.2f", sum, avg);	
	}
}
/*
 * Q: 5개의 숫자 입력 후 합계 및 평균을 출력
 * 
 * 5개의 숫자: 12.3 36.5 6.7 2.0 71.3
 */
