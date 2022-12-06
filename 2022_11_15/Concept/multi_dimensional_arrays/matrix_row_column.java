package multi_dimensional_arrays;

public class matrix_row_column {
	public static void main(String[] args) {
		int[][] m1 = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 }
				};

		int[][] m2 = { 
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
				};

		final int ROW = m1.length;
		final int COL = m2[0].length;
		final int M2_ROW = m2.length;

		int[][] m3 = new int[ROW][COL];

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				for (int k = 0; k < M2_ROW; k++) {
					m3[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			System.out.println();
		}

	}
}
// 행렬(Matrix) 곱셈법

//   m1		x	  m2 		= 						   m3
//A0 A1 A2		a0	a1			A0*a0 + A1*b0 + A2*c0		A0*a1 + A1*b1 + A2*c1
//B0 B1 B2		b0  b1			B0*a0 + B1*b0 + B2*c0       A0*a1 + A1*b1 + A2*c1
//				c0  c1
