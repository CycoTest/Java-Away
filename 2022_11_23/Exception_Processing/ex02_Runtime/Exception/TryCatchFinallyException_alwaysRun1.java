package ex02_Runtime.Exception;

public class TryCatchFinallyException_alwaysRun1 {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			System.out.println(data1);
			System.out.println(data2);			
		} catch (ArrayIndexOutOfBoundsException e) {
//			catch의 파라미터의 의미는 try에서 시행하는 코드에서 발생하는 오류를 하나의 객체로 취급한다는 뜻
//			try절 내 어느 라인에서든 문제가 발생하면 바로 catch절로 이동한다
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
	}
}
/*
 * TryCatch절은
 * -> 코드가 실행되는 과정 중 행여라도 발생할 오류로 인하여 
 * 		프로그램이 비정상적인 이유로 종료되는 것을 방지하기 위해 사용됨
 * 
 * 
 */

