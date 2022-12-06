public class BreakEx01 {
	public static void main(String[] args) {
		
		int i = 1;
		
		while (true) { 
			System.out.println(i);
			
			if (i==6)
				break;
			
			i = i + 1;
		}
	}
}
/*
 * while (true) : 무한반복문
 * 	- while 반복문은 조건이 true일 때, 반복 실행
 * 	- (true)는 boolean 타입으로, 강제로 true로 고정했다는 의미
 * 
 * break문
 * 
 * loop([조건식]) {
 * 
 * 	(1)
 * 	break;
 * 	
 * 	(2)
 * 
 * };
 * 
 */

