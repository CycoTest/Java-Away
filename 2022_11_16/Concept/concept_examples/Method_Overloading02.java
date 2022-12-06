package concept_examples;
public class Method_Overloading02 {

	double areaRectangle(double width) {
		return width * width;
	}

	double areaRectangle(double width, double height) {
		return width * height;
	}

	public static void main(String[] args) {
		Method_Overloading02 myCalc = new Method_Overloading02();

		double result1 = myCalc.areaRectangle(4.0);
		double result2 = myCalc.areaRectangle(4.0, 6.0);

		System.out.println(result1);
		System.out.println(result2);
	}
}
/*
 * 
 */
