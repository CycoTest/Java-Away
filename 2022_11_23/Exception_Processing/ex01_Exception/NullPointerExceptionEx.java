package ex01_Exception;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
	}
}
/*
 * java.lang.NullPointerException:
 * Cannot invoke "String.toString()" because "data" is null
 * (NullPointerExceptionExample.java:6)
 * 
 * -> String의 참조 변수인 data의 변수값이 초기화, 즉 비어있기 때문에
 * 		String.toString() 명령어를 실행할 수 없다
 */
