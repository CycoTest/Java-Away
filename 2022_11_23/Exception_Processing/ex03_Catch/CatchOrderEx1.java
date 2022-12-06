package ex03_Catch;

public class CatchOrderEx1 {
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
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}
	}
}
/*
 * 만약 catch절의 파라미터 중 ArrayIndexOutOfBoundsException가 Exception보다 아래에 위치하면
 * 
 * 아래와 같은 에러 메세지가 뜬다
 * Unreachable catch block for ArrayIndexOutOfBoundsException.
 * It's already handled by the catch block for Exception
 * 
 * 이는 Exception 클래스가 예외 클래스 중 최상위 클래스이기 때문에 발생하는 문제이다.
 * 
 * 이 때문에, 반드시 예외 처리를 할 땐
 * 	상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 한다
 */
