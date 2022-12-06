package concept_examples;
public class multi_dimentional_arrays {
	public static void main(String[] args) {
		int[][] score = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }
				};
		int sum = 0;

		for (int i = 0; i < score.length; i++) { // i값은 행
			for (int j = 0; j < score[i].length; j++) { // j값은 열
				System.out.printf("score[%d][%d]=%d\n", i, j, score[i][j]);
			}
		}

		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}

		System.out.println("sum= " + sum);
	}
}
