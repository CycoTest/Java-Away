package concept_examples;
import java.util.Arrays;

public class math_random01 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 };
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) { // 시행 횟수는 배열 변수 arr의 길이인 10번
			int tmp = (int) (Math.random() * code.length);
//			배열 변수 code의 길이인 0.0 ~ 4.0까지의 무작위 실수를 정수 타입으로 변환하여 정수 타입 변수인 tmp에 저장
//			즉, tmp에 저장되는 수는 정수 0부터 4까지에 해당
			
			arr[i] = code[tmp];
//			배열 변수 arr의 값은 배열 변수 code의 값과 동일
//			배열 변수 code의 값은 tmp에 저장된 값으로 배열 변수 code가 출력될 수 있는 값은
//			맨처음 지정했던 code에 저장되어 있는 5가지 수 모두임
			
//			즉, 배열 변수 arr에 저장될 수 있는 값은
//			for문 최대 시행 횟수인 10번 동안 무작위로 들어오는 배열 변수 code의 값임
		}

		System.out.println(Arrays.toString(arr));
//		그리고 그렇게 저장된 배열 변수 arr의 값을 문자열 형태로 만들어서 출력
		
//		반복문을 이용하여 출력될 때와 다르게 대괄호가 포함된 채로 나옴
	}
}
