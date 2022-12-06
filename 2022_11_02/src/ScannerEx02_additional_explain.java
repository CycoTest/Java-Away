import java.util.Scanner; 
// Scanner를 사용하기 위해 추가
// 종류 상관 없이 해당 명령어를 추가해주는 단축키로는 ctrl + shift + O
//	-> 하지만 어떤 기능을 쓸지 변수 선언이 선행되어야 함

public class ScannerEx02_additional_explain {
	// class 이름을 지을 때, 반드시 자바에서 제공하는 기능명과 동일하면 안 됨
	// 코딩 및 컴파일 중 오류 발생이 나올 수 있음
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 외부입력을 받기 위한 기능을 먼저 선언함
		// 변수 선언으로 할 변수명은 외부입력으로 받을 기능명으로 하면 됨
		System.out.println("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		// 입력받은 문자열을 input에 저장
		
		// String : 문자열을 인식하는 클래스 타입형
		// String input = scanner.next(); : 입력되는 문자열 중 공백 이전의 문자열 하나만 인식
		// String input = scanner.nextLine(); : 입력되는 문자열 중 공백 포함한 모든 문자열 인식
		
		// int input = scanner.nextInt(); : 입력되는 문자열 중 int 타입인 정수만 인식
		// double input = scanner.nextDouble(); : 입력되는 문자열 중 double 타입인 실수만 인식
		
		// char input = scanner.next().charAt(0);
		// 입력되는 문자열 중 char 타입인 문자 하나만 인식하지만,
		// char 타입을 적용할 땐, 특수한 명령이 추가로 들어가야 하고 그것이 뒤에 붙은 'charAt()'이다
		// 또한 문자는 일반적인 순번과 달리 첫 번째자리를 0번째로 인식한다. 따라서 ABS에서 A의 자리는 0번째 자리가 되는 셈
		
		scanner.close(); 
		// 교재에는 없으나, Warning 방지를 위한 code
		// Scanner 기능은 유효한 범위를 다 사용하면 닫아주는 게 안전한 기능임
		
		int num = Integer.parseInt(input);
		// 입력받은 내용을 int 타입의 값으로 변환 (입력받은 문자열을 숫자로 변환)
		// int n = scanner.nextInt();
		// 입력값이 문자열인 걸 수로 변환하는 추가 과정 없이, 바로 정수로 넘겨받는 명령어
		
		System.out.println("입력내용 :" + input);
		System.out.printf("num=%d\n", num);
	}
}
/* 
자바의 장점 : 개발자가 새 기능을 개발할 필요없이, 미리 기능을 지원해준다 

자바에서 출력하는 데 쓰이는 명령어 
	1. System.out.println();
	2. System.out.print();
	3. System.out.printf();
	
문자열 : 자바에서는 '문자의 집합'으로 인식함
 */