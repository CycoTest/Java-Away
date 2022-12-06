package ex02_Runtime.Exception;

public class TryCatchFinallyExceptionEx {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		data1 = args[0];
		data2 = args[1];
		
		System.out.println(data1);
		System.out.println(data2);
	}
}
/*
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
 * Index 0 out of bounds for length 0
 * (TryCatchFinallyException.java:8)
 * 
 * -> args 배열값이 입력되지 않았기 때문에
 * 		args 배열의 범위가 없다
 *		
 *		그래서 문제가 발생한 것 
 * 
 */

