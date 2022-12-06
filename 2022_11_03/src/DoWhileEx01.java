public class DoWhileEx01 {
	public static void main(String[] args) {
		int i = 1;
		
		do {
			System.out.println(i++);
		} while (i <= 5);
	}
}
/*
 *  do-while문과 while문의 차이
 *  
 *  while문은 실행 초기에 조건식을 확인하고 true이면 실행 속행
 *  	
 *  do-while문은 실행 마지막에 조건식을 확인하고 true이면 실행 속행
 *		- 단, true/false 여부를 떠나서 최소 한 번은 실행함  
 */
