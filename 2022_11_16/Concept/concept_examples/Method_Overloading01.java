package concept_examples;
public class Method_Overloading01 {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double plus(double x, double y) {
		double result = x + y;
		return result;
	}

	double plus(double x, int y) {
		double result = x + y;
		return result;
	}

	public static void main(String[] args) {
		Method_Overloading01 myCalc = new Method_Overloading01();
		int res1 = myCalc.plus(5, 10);
		double res2 = myCalc.plus(10.5, 20.3);

		System.out.println(res1);
		System.out.println(res2);
	}

}
/*
 * 메소드 오버로딩(method overloading)
 * 	- 생성자 오버로딩(constructor overloading)과 동일한 개념
 * 		-> 동일한 타입, 개수, 순서의 메소드는 중복할 수가 없다
 * 			하지만, 생성자 오버로딩 때처럼 파라미터를 다르게 설정하면
 * 			컴파일 에러를 벗어날 수 있다
 * 	
 * 	- 호출할 때
 * 		-> System.out.print/printf/println();
 * 		
 * 			
 * 
 */
