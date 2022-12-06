public class WhileEx01 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++; // <-- 이게 없을 경우, 1이 무한으로 출력된다
		}
	}
}
/*
 *  반복문 - while문
 *  
 *  while([조건식]) {
 *  	[조건식]이 true인 동안 실행
 *  }
 */
