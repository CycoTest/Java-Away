package ex01_Exception;

public class NumberFormatExceptionEx {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.printf("%d + %d = %d", data1, data2, result);
	}
}
/*
 * Exception in thread "main" java.lang.NumberFormatException:
 * For input string: "a100"
 * (NumberFormatException.java:9)
 * 
 * -> 9번째 라인에서 해당 예외가 발생한다
 * -> String 참조 변수의 data2의 변수값이 "a100"이다
 *  	헌데 9번 라인에서 선언된 int 타입의 변수 value2의 값은 
 *  	data2의 값을 int 타입으로 변환하고 입력하려고 한다
 *  
 *   	여기서 문제가 발생했다
 *   	data2의 값엔 int 타입에 해당되는 100이 있지만,
 *   	int 타입에 해당되지 않은 a도 있기 때문에
 *   	
 *   	int 타입으로 변환하지 못하여 예외 오류가 발생한 것이다
 * 
 */

