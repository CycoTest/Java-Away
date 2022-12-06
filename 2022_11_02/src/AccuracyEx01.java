public class AccuracyEx01 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		// ? = 1 - 7 * 0.1
//		double result = apple - number * pieceUnit;
		
//		 double result = apple - number * pieceUnit;
		 double result1 = number * pieceUnit;
		 double result2 = apple - result1;	
		
		System.out.println(result2);
	}
}
// 사업용 코딩 비교툴 : Beyond Compare
// 무료 코딩 비교툴 : AcroEdit / AcroDiff