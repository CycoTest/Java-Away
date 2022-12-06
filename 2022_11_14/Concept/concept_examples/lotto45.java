package concept_examples;
public class lotto45 {
	public static void main(String[] args) {
		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		int temp = 0;
		int j = 0;

		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
//			14~16번 라인의 코드는 배열 변수 ball 과 temp의 값을 swap해주는 행위임
		}

		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
		}
	}

}
