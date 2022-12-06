public class Array_type {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 15, 56, 88,
				39, 0, 23, 46, 70, 90,
				61, 82, 28, 35, 49, 52,
				33, 21, 4, 9, 100, 98,
				91, 92, 63, 55, 68, 59};
		for (int i=0; i<scores.length;i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			// scores.length : scores 배열의 전체 길이를 자동으로 불러옴
			sum += scores[i]; // sum = sum + scores[i]
		}

		System.out.println("sum : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("avg : " + avg);
	}
}
/*
 * 배열(Array)
 * 	- 같은 타입의 데이터를 연속된 공간에 나열시키고,
 * 	각 데이터에 인덱스(index)를 부여해 놓은 자료구조
 * 	- 생성된 배열의 크기를 변경할 수 없음
 * 		-> 만약 배열의 크기를 변경하고 싶다면, 새 배열을 생성하면 됨
 * 
 * 배열 선언
 * 	- 타입[] 변수;
 * 	- 타입 변수[];
 * 
 * 선언과 동시에 초기화
 * 	- String[] names = {"Kang", "Kim", "Lee"};
 * 		-> String 배열의 길이는 3
 * 
 * 참조할 배열 객체가 없다면 null로 초기화
 * 	- 타입[] 변수 = null;
 * 
 * ex)
 * int student[10] = {83, 90, 87, 78, ... 65};
 * 	- 배열 변수 타입을 선언함과 동시에 변수의 실제값을 초기화하는 방법
 * 
 * int student[] = new int[10];
 * 	- new int[10]; : Heap 영역에 40칸들이 int 타입의 메모리 공간을 할당받음
 * 	- int student[] : 
 * 		변수값은 Heap 영역에 할당받은 int 타입의 메모리 공간 중 
 * 		제일 첫 번째 칸의 주소값이 들어가 있음
 */

/*
 * 우리나라 3대 SI 대기업
 * 	- 삼성SDS
 * 	- LG CNS
 * 	- SK C&C
 */
