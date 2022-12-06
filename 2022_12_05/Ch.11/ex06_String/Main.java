package ex06_String;

public class Main {
	public static void main(String[] args) {
		byte bytes[] = { 72, 101, 108, 111, 32, 74, 97, 118, 97 };

		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 5, 4);
		System.out.println(str2);

		System.out.printf("%c ", 65);
		System.out.printf("%c", 97);
	}
}
