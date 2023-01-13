package component.signup.addon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCondition {
	public String isValidPassword(String password) {
		final int MIN = 8;
		final int MAX = 20;

		// 영어, 숫자, 특수문자를 포함한 min to max 문자식
		final String ALLPT = "^((?=.*\\d)(?=.*[a-zA-Z])(?=.*[\\W]).{" + MIN + "," + MAX + "})$";
		// 3자리 연속된 문자식
		final String SAMEPT = "(\\w)\\1\\1";
		// 공백 문자식
		final String BLANKPT = "(\\s)";

		// 문자식 검사
		Matcher matcher;

		// 공백 체크
		if (password == null || "".equals(password)) {
			return "알림: 비밀번호를 입력하세요";
		}

		// 글자 길이 체크
		String tmpPW = password.toUpperCase();
		int strLength = tmpPW.length();
		if (strLength > 20 || strLength < 8) {
			return "알림: 비밀번호 글자 길이 불일치(자릿수: " + strLength + ")";
		}

		// 공백 체크
		matcher = Pattern.compile(BLANKPT).matcher(tmpPW);
		if (matcher.find()) {
			return "알림: 공백";
		}

		// 비밀번호 체크
		matcher = Pattern.compile(ALLPT).matcher(tmpPW);
		if (!matcher.find()) {
			return "알림: 조건 불일치";
		}

		// 동일한 문자 3개 이상 체크
		matcher = Pattern.compile(SAMEPT).matcher(tmpPW);
		if (matcher.find()) {
			return "연속된 문자";
		}

		// 연속된 문자, 숫자 3개 이상 체크
		int[] tmpArr = new int[strLength];

		for (int i = 0; i < strLength; i++) {
			tmpArr[i] = tmpPW.charAt(i);
		}

		for (int i = 0; i < strLength - 2; i++) {
			// 첫 글자 A-Z, 0-9
			if ((tmpArr[i] > 47 && tmpArr[i + 2] < 58) || (tmpArr[i] > 64 && tmpArr[i + 2] < 91)) {
				if (Math.abs(tmpArr[i + 2] - tmpArr[i + 1]) == 1 && Math.abs(tmpArr[i + 2] - tmpArr[i]) == 2) {
					char c1 = (char) tmpArr[i];
					char c2 = (char) tmpArr[i + 1];
					char c3 = (char) tmpArr[i + 2];

					return "알림: 연속된 문자: \"" + c1 + c2 + c3 + "\"";
				}
			}
		}

		return ">>> 통과";
	}

	public static void main(String[] args) {
		// Test Set
		String[] testSet = { 
				"votmdnj&em123", "kjs@aldkjfklj43", "QBWfklj4543",
				"abct438983", "acdf@sabcer9182",
				"alfl234kdd", "asd@fasdf987"
				// Blank 테스트 문자열
				, "xp@tmxm85 84"
				// 공백 테스트 문자열
				, ""
				// 문자 길이 테스트 문자열
				, "OJHDSJK@HFzDLKDJLJoiejwf42^%wij", "xyz47@", "1lkjvneim@"
				// ASCII Overflow 테스트 문자열
				, "/01alkjdffn", "9:;aslkdjfkja2", "?@alakjlkiie3", "Z[\\ekjmvkfd4", "@abieofinv2",
				"89:8973589723dfasb", "YZ[qoeirnvk235" 
				};
		
		PasswordCondition test = new PasswordCondition();

		for (String s : testSet) {
			System.out.println("Password: \"" + s + "\"");
			System.out.println(test.isValidPassword(s));
			System.out.println("--------------------------------");
		}
	}
}
