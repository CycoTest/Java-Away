package ex04_Throws;

public class ThrowsEx1 {
	public void exceptionMethod() throws Exception {
		throw new Exception();
	}
//	
	
	
	public static void main(String[] args) {
		ThrowsEx1 te1 = new ThrowsEx1();

		try {
			te1.exceptionMethod();
		} catch (Exception e) {
			System.out.println(e); // e.toString()로 자동 호출
			e.printStackTrace();
		}
	}
}
/*
 * 
 * 
 * 
 */

