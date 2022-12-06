package ex24_String.toPrimitive;

public class Main {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.printf("value1 : %d\n", value1);
		System.out.printf("value2 : %.2f\n", value2);
		System.out.printf("value3 : %s\n", value3);
	}
}
