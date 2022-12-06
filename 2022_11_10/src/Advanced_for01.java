public class Advanced_for01 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
//		i++ : 순차적으로 배열 전체에 변수값을 입력 후 출력
		
		for (int i = 0; i < arr.length; i+=2) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
//		i+=2 : 홀수번째 변수값만 출력
		
		for (int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();

		System.out.println("sum=" + sum);
	}
}
/*
 * 
 */

