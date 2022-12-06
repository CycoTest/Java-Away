package ex02_getProperty;

import java.util.Properties;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("userName");
		String userHome = System.getProperty("userHome");

		System.out.printf("운영체제 이름 : %s\n", osName);
		System.out.printf("사용자 이름 : %s\n", userName);
		System.out.printf("사용자 홈디렉토리 : %s\n", userHome);

		System.out.println("---------------------------------------");
		System.out.println("[ key ] version");
		System.out.println("---------------------------------------");

		Properties props = System.getProperties();
		Set keys = props.keySet();
		for (Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.printf("[ %s ] %s\n", key, value);
		}
	}
}
