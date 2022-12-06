package ex18_StringBuilder2;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
//		System.out.println(sb);
//		String 한정으로 둘 다 가능

		sb.insert(4, "2");
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());

		sb.replace(6, 13, "book");
		System.out.println(sb.toString());

		sb.delete(4, 5);
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.printf("총 문자 수 : %d\n", length);

		String result = sb.toString();
		System.out.println(result);
	}
}
