public class Array_type_2nd {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];

		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
//				System.out.println("mathScorse[" + i + "][" + j + "] = " + mathScores[i][j]);
				System.out.print(mathScores[i][j]);
			}
			
		}
		System.out.println("-------------");
		
		mathScores[1][0] = 80;
		mathScores[1][2] = 99;

		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
//				System.out.println("mathScorse[" + i + "][" + j + "] = " + mathScores[i][j]);
				System.out.print(mathScores[i][j]);
			}
		}
	}
}
/*
 * 2차원 배열 : 행렬
 * 
 * ex) int[][] score = new int[2][3];
 * 		-> new int[2][3] : 2행 3열짜리로 된 int 타입의 행렬을 Heap 영역에 생성
 */
