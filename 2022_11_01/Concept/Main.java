import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int sum = a + b + c;
		double avg = (double) sum / 3;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.printf("avg : %.3f\n", avg);
		// 평균값의 소수점 자리도 지정할 수 있다
		// .3 : 소수점 셋째짜리까지 표기한다는 뜻
	}
}
