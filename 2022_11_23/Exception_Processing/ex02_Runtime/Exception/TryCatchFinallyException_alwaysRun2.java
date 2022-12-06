package ex02_Runtime.Exception;

public class TryCatchFinallyException_alwaysRun2 {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;

			System.out.printf("%d + %d = %d", data1, data2, result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
		
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		
		} finally { // TryCatch절에서 조건 여부와 상관없이 무조건 실행된다
			System.out.println("다시 실행하세요");
		}
	}
}
/*
 * 위의 해당 코드에서
 * 
 * String 참조 변수 data1과 data2의 변수값으로 
 * 각각 args 배열에 입력되는 것들이 들어간다
 * 
 * int 타입의 변수 value1과 value2의 변수값으로는
 * 각각 문자열로 입력된 data1과 data2에 저장된 변수값이
 * int 타입인 경우에만 Integer.parseInt() 메소드로 인하여 문자열이 정수로 변환되어 들어간다
 * 
 * -> 에러 여부를 확인하기 위한 코드는 try절에 들어가 있는 내용이다
 * -> 각 catch절에서 확인하는 것들은 본래 검사하기 위한
 *  
 * 
 * 
 * 
 * 
 */

