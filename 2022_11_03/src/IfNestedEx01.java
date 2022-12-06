public class IfNestedEx01 {
	public static void main(String[] args) {
		int score = 84;
		
		if (score >= 90) {
			System.out.print("A");
			if (score >= 95) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		} else {
			System.out.print("B");
			if (score >= 85) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
		// if절 뒤에 else if절이 올 경우, 조건문을 다시 시행
		// if절 뒤에 else절이 올 경우, else절 무조건 시행
	}

}
