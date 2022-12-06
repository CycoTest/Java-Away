import java.util.Calendar;

public class Enumerate_type {
	enum Week {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	};
	// 모두 상수를 입력할 때, 모두 대문자로 씀
	// 상수 <-> 변수
	// 상수 = 절대 변하지 않은 수
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		// Calendar.getInstance();
		// new를 쓰지 않은 싱글턴패턴 (객체를 오직 1개 내지 2개를 생성해주는 패턴)
		int iweek = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (iweek) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("오늘은 쉬는 날입니다.");
		} else {
			System.out.println("오늘은 공부하는 날입니다.");
		}
	}
}
/*
 * Head First Design Patterns - 중급 자바용 권장도서
 * 	- 보다 관리하기 편한 코딩 구조들에 관한 소개
 * 
 */
