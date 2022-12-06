package quiz01;


import java.util.Scanner;

public class feedback_TTSt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sum = 0;
		int count = 0;
		while (count < 5) { // 5번째 반복이 끝나고, 6번째가 될 때 다시 위로 올라와서 걸러짐
			double i = sc.nextDouble();
			count++; // count는 prefix를 해도 되고 postfix를 해도 상관 없음
			sum += i; // sum = sum + i;
		}
		sc.close(); // 반복문이 끝나고 더는 스캐너 기능을 이용하지 않기에 여기에 닫는 명령어를 넣음
		
		System.out.printf("sum = %.1f\n", sum);
		System.out.printf("avg = %.2f", sum / count);
//		System.out.printf("sum = %.1f\n avg = %.2f", sum, sum / count);
//		이렇게 해도 상관 없음
	}
}
