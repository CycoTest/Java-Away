package ex09_length;

public class Main {
	public static void main(String[] args) {
		String ssn = "123456-1234567";

		int length = ssn.length();
		System.out.printf("length : %d\n", length);

		if (length == 4) {
			System.out.println("주민등록번호가 맞습니다.");
		} else {
			System.out.println("주민등록번호가 아닙니다.");
		}
	}
}
