package ex01_Exception;

public class ArrayIndexOutOfBoundsException_alwaysRun {
	public static void main(String[] args) {
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];

			System.out.printf("args[0] : %s\n", data1);
			System.out.printf("args[1] : %s\n", data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayOutOfBoundsException_alwaysRun  ");
			System.out.println("값1 값2");
		}
	}
}
/*
 * 해당 파일과 ArrayIndexOutOfBoundsException 파일의 차이점은
 * 	-> 값을 충족하지 못할 경우를 대비한 예외 실행 코드를 추가 여부이다
 * 
 * 해당 파일은 if절을 넣음으로써
 * 	else에 agrs 배열에 어떠한 값도 입력되지 않아 발생하는 예외를 원천 봉쇄하는 코드가 추가되어 있다
 * 
 */
