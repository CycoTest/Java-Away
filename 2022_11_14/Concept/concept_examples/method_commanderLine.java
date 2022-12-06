package concept_examples;
public class method_commanderLine {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("usage: java method_commanderLine NUM1 OP NUM2");
			System.exit(0);
		}

		int num1 = Integer.parseInt(args[0]);
		char op = args[1].charAt(0);
		int num2 = Integer.parseInt(args[2]);
		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case 'x':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
		default:
			System.out.println("지원되지 않는 연산입니다.");
		}
		System.out.println("결과 : " + result);
	}
}
/*
 * 커맨더 라인(Commander Line) 실행법
 * 
 * 	1) 해당 java파일에 마우스 커서를 갖다 대고, 
 * 		마우스 오른쪽 클릭 후 Run As\Run Configurations 클릭
 * 	2) 실행하고자 하는 java파일이 맞는지 확인 후,
 * 		오른쪽 설정 메뉴에서 (x) = Arguments탭을 클릭
 * 	3) Program Arguments 박스 내에 입력하고자 하는 명령어 입력
 * 	4) Run 클릭
 * 		Console perspective에서 해당 java파일의 컴파일값이 뜬다
 */
