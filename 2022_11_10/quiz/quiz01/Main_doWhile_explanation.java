package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Main_doWhile_explanation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double darr[] = new double[6]; 
//		입력받는 것에 대한 명확한 정의가 없음, 일단 실수로 정의하여 배열 변수명을 
//		darr(arrays in double type)로 선언
//		6개의 값을 입력받으므로, 배열 길이는 6칸으로 정의
		
		int i = 0; 
//		배열 변수 darr의 배열 순서 초기화
//		배열칸의 맨앞자리 언제나 0번째부터 시작
		do {
			darr[i++] = sc.nextDouble();
		} while (i < darr.length);
		sc.close();
//		6칸의 배열 변수에 순차적으로 값을 입력하는 do-while 반복문
		
		Arrays.sort(darr);
//		중구난방으로 입력된 배열값을 순서대로 정렬해주는 기능
//		import java.til.Arrays로 불러온다
		
		double dArr[] = new double[6];
//		역순으로 정렬하기 위한 6칸짜리 배열 변수 dArr 선언
		
		int j = 0;
//		배열 변수 dArr의 배열 순서 초기화
		do {
			i = i - 1; // 마지막에 저장된 i 값은 6이다
			dArr[j++] = darr[i];
//			dArr 배열의 첫번째자리에 darr 배열의 마지막 번째자리에 배치된 수가 들어감
		} while (i > 0 && j < darr.length);
//		do-while 반복문에 i 계산식이 있다. darr배열의 첫 번째자리는 0번째이므로, i값이 음수가 나와선 안 됨
		
//		Arrays.sort(darr, Collections.reverseOrder());
//		위 명령어로 역순 재정렬이 한 방에 가능
//		그러면, 역순 정렬을 위한 6칸짜리 배열 변수를 추가로 생성하지 않아도 됨
		
		j = 0;
		do {
			System.out.print(dArr[j++] + " ");
		} while (j < darr.length);
//		역순 정렬된 배열 변수 dArr의 각 칸별 값을 출력해줌
		
//		만약 한 방에 역순 재정렬이 되는 명령어를 썼다면,
//		do-while문 내 출력 명령어 중 변수값을 dArr에서 darr로 바꿔주면 됨
	}
}
/*
 * Q: 사용자로부터 6개의 값을 입력받아서 
 * 		가장 큰 값부터 차례대로 출력하는 프로그램을 작성하시오
 * 
 * input ex) 27 5 19 90 72 39
 * 
 * output ex) 90 72 39 27 19 6
 */
