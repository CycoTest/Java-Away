package ex08_indexOf;

public class Main {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.printf("location : %d\n", location);

		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련이 있습니다.");
		} else {
			System.out.println("자바와 관련이 없습니다.");
		}
	}
}
