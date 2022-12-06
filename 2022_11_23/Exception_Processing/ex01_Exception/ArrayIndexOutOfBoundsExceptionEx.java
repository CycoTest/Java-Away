package ex01_Exception;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];

		System.out.printf("args[0] : %s\n", data1);
		System.out.printf("args[1] : %s", data2);
	}
}
/*
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
 * Index 0 out of bounds for length 0
 * (ArrayIndexOutOfBoundsException.java:5)
 * 
 * 배열 args에 입력된 값이 없기 때문에, 배열이 선언되지 않아
 * 배열 범위를 벗어났다는 에러 메세지가 뜸
 * 
 * 
 * args[]의 경우, 해당 자바 파일에서 
 * Run As\Run Configurations\(x)=Arguments\Program Arguments\공백 포함하여 문자열 2개 입력
 */
