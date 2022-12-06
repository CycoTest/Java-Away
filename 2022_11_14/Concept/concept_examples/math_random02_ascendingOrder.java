package concept_examples;
public class math_random02_ascendingOrder {
	public static void main(String[] args) {
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
//			System.out.print(numArr[i] = (int) (Math.random() * 10));
			numArr[i] = (int) (Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false;

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // 앞쪽의 수가 뒤쪽의 수보다 클 경우 작동
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
					changed = true;
				}
//				bubble sort의 작동 원리
				
			}

			if (!changed) {
				break;
			}

			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	}
}
