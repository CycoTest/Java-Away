package concept;
public class arrays01 {
	public static void main(String[] args) {
		int score[] = new int[5];
		int k = 1;

		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int score2[] = { 50, 60, 70, 80, 90 };
		System.out.print(score2); 
//		배열 변수[i]를 넣지 않고 변수명만 넣을 경우, 출력값이 이상하게 나옴
//		이는 간단하게 말해서 Heap 영역의 메모리 공간에 할당된 배열 변수 score2의 객체를 구분하는 값임
//		주소값만 배웠다면, 객체를 구하는 값 = 주소값이 되는 셈임
		System.out.println();
		
		int tmp = score2[k + 2] + score2[4];

		for (int i = 0; i < 5; i++) {
			System.out.printf("score[%d]:%d\n", i, score[i]);
		}

		System.out.printf("tmp:%d\n", tmp);
	}
}
/*
 * 배열(Arrays)
 * 
 * 인덱스(index)의 범위 = 0부터 배열의 길이 -1까지
 * 	-> 0 <= i <= arr.length
 * 
 * 배열의 길이 = int 범위의 양의 정수(0도 포함)이어야 함
 *	-> 배열 이름.length = 상수
 */
