package ex13_trim;

public class Main {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "  4567    ";

		System.out.printf("%s%s%s\n", tel1, tel2, tel3);
		System.out.printf("%s%s%s\n", tel1.trim(), tel2.trim(), tel3.trim());
	}
}
