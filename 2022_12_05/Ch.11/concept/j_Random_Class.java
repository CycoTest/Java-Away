package concept;

public class j_Random_Class {

}
/*
 * 13. Random 클래스
 * 	- java.util.Random 클래스
 * 		-> 난수를 얻어내기 위한 다양한 메소드를 제공
 * 		-> 종자값(seed)에 따라 다른 난수를 발생
 * 
 * 		a. Random() : 호출시마다 다른 종자값(현재 시간 이용)이 자동 설정된다
 * 			-> 파라미터에 현재 시간을 넣는 이유, 실행할 때마다 서로 다른 난수를 생성하기 위함
 * 
 * 		b. Random(long seed) : 매개값으로 주어진 종자값이 설정된다
 * 
 * 	- Random 클래스가 제공하는 메소드
 * 	(1) nextBoolean()
 * 		-> 리턴값 = boolean
 * 		-> boolean 타입의 난수를 리턴
 * 
 * 	(2) nextDouble()
 * 		-> 리턴값 = double
 * 		-> double 타입의 난수를 리턴(0.0 <= ~ < 1.0)
 * 
 * 	(3) nextInt()
 * 		-> 리턴값 = int
 * 		-> int 타입의 난수를 리턴(-2^31 <= ~ 2^31 - 1)
 * 
 * 	(4) nextInt(int n)
 * 		-> 리턴값 = int
 * 		-> int 타입의 난수를 리턴(0 <= ~ < n)
 * 		
 * 
 */
