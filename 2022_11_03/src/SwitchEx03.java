public class SwitchEx03 {
	public static void main(String[] args) {
		String position = "과장";
		
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		case "대리":
			System.out.println("300만원");
			break;
		default:
			System.out.println("직급을 입력해주세요.");
			break;
		}
		// 주의할 점: position의 변수타입과 case의 변수타입은 반드시 동일해야함
		// 변수값이 문자열인 경우, 문자열의 내용이 일치하여야 지정된 경우의 수 중 하나로 인식
		// 만약 일치하는 게 없을 경우, default로 넘어감
	}
}
//버그 테스트(디버깅)을 할 때, 최소 1번씩 모든 로직을 통과할 만큼은 해야 함

//디버깅 버튼
//F6(step over): 디버깅 중 내가 확인하고자 하는 라인을 순차적으로 넘어가는 것
//F5(step into): 디버깅 중 내가 확인하고자 하는 라인의 method의 기능 안으로 들어감
//	-> 해당 기능의 설명을 보여줌
//F7(step return): 디버깅 중이었던 method가 있는 라인으로 복귀해줌