public class StringConcatEx01 {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;
		
		String str5 = "JDK" + 3 + 3.0;
		// 우항에서, 문자열은 뒤이어 나오는 변수값의 타입이 다를지언정, 같은 문자열로 바꾸게 한다
		String str6 = 3 + 3.0 + "JDK";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}
}
