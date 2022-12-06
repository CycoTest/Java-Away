package ex11_subString;

public class Main {
	public static void main(String[] args) {
		String ssn = "870913-1234567";
		
		String firstNum = ssn.substring(0, 6);
//		substring(int beginIndex, int endIndex)
		String secondNum = ssn.substring(7);
//		substring(int beginIndex)
		
		System.out.printf("firstNum : %s\n", firstNum);
		System.out.printf("secondNum : %s\n", secondNum);
	}
}
