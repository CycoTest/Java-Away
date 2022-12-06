public class WhileEx02 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			
			if (i==5) {
			// i==5 : i의 변수값이 5와 동일해질 때 라는 의미	
				break;
			}
		}
	}
}
