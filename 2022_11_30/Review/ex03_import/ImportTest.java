package ex03_import;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");

		System.out.printf("오늘 날짜는 %s\n", date.format(today));
		System.out.printf("현재 시간은 %s\n", time.format(today));
	}
}
