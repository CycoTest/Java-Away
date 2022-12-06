package ex02_Calender.Class;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);

		System.out.printf("%d년 ", year);
		System.out.printf("%d월 ", month);
		System.out.printf("%d일 \n", day);

		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		if (ampm == Calendar.AM) {
			strampm = "오전";
		} else {
			strampm = "오후";
		}
		System.out.printf("%s ", strampm);

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.printf("%d시 ", hour);
		System.out.printf("%d분 ", minute);
		System.out.printf("%d초 ", second);
	}
}
