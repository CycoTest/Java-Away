package concept_examples;
public class morse_code {
	public static void main(String[] args) {
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", "."
						, "..-.", "--.", "....", "..", ".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-", ".-.", "...", "-"
						, "..-", "...-", ".--", "-..-", "-.--"
						, "--.."};
		
		String result = "";

		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i) - 'A'];
		}
		System.out.println("source: " + source);
		System.out.println("morse: " + result);
	}
}
/*
 * Java 자격증
 * 	- CCNA : network 관련 자격증
 * 	- OCJP : oracle 자격증
 * 	- OCP : DB 관련 자격증
 * 여기까지는 족보로 나온 문제들로 패스 가능
 * 
 * 	- SAP : ERP(재무회계, 인사관리) 관련 자격증
 * 
 */
