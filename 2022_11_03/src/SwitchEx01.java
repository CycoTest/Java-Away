public class SwitchEx01 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		
		int num = (int)(Math.random()*6)+1;
		// 0.0 <= Math.random < 1.0
		// 0.0 <= M*6 < 6.0
		// int 타입 적용, 0 <= (int)M*6 < 6
		// 최종 범위, 1 <= (int)M86+1 < 7
		// num에 나올 수 있는 수: 1,2,3,4,5,6
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			break;
		}
	}
}
/*
Switch문
	- case : 각 경의 수에 해당하는 변수값
	- break : 조건에 맞는 경우의 수에서 실행이 멈추게 해주는 명령어
		break문이 없을 경우, 어느 경우의 수에 해당하냐에 따라 하위 경우의 수에 해당하는 모든 변수값까지 다 출력됨
*/