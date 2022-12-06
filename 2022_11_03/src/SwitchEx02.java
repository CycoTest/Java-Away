public class SwitchEx02 {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		// 0.0 <= M < 1.0
		// 0.0 <= M*4 < 4.0
		// int 타입 적용, 0 <= (int)M*4 < 4
		// 최종 범위, 8 <= (int)M*4+8 < 12
		// 가능한 경우의 수 = 8, 9, 10, 11
		System.out.println("현재시간 : " + time);
		
		switch (time) {
		case 8:
			System.out.println("출근합니다");
		case 9:
			System.out.println("회의를 합니다");
		case 10:
			System.out.println("업무를 봅니다");
		default:
			System.out.println("외근을 나갑니다");
		// default : 나올 수 있는 경우의 수 중 지정되지 않은 변수들은 기본값에 배정
		}
	}
}
