package concept_examples;
public class none_fixed_multi_dimetional_arrays {
	public static void main(String[] args) {
//		1-1. 15칸짜리 2차원 배열 생성
		int[][] score1 = new int[5][3];
		
//		1-2. 15칸짜리 2차원 배열 생성
		int[][] score2 = new int[5][];
		score2[0] = new int[3];
		score2[1] = new int[3];
		score2[2] = new int[3];
		score2[3] = new int[3];
		score2[5] = new int[3];
		
//		1-3. 15칸짜리 2차원 배열 생성
		int[][] score3 = new int[5][];
		for (int i = 0; i < score3.length; i++) {
			score3[i] = new int[3];
		}
	}
}
