package concept_examples;
public class math_random03_numberCounting {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
//		배열 변수 numArr의 각 칸별 숫자를 하나씩 비교하여, 숫자를 세는 방법

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	}

}
