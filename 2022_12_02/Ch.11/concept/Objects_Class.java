package concept;

public class Objects_Class {
}
/*
 * 4. Objects 클래스
 * 	
 * 	- Object와 유사한 이름을 가진 java.util.Objects 클래스는
 * 		객체 비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 연산을 수행하는
 * 		정적 메소드들로 구성된 Objects의 유틸리티 클래스이다
 * 
 * => 리턴타입
 * 	(1) int 
 * 		a. compare(T a, T b, Comparator<T> c)
 * 			-> 두 객체 a와 b를 Comparator를 사용해서 비교
 * 
 *  	b. hash(Object... values)
 *  		-> 매개값이 저장된 배열의 해시코드 생성
 *  	
 *  	c. hashCode(Object o)
 *  		-> 객체의 해시코드 생성
 *  
 *  (2) boolean
 *  	a. deepEquals(Object a, Object b)
 *  		-> 두 객체의 깊은 비교(배열 항목까지 비교)
 *  
 *  	b. equals(Object a, Object b)
 *  		-> 두 객체의 얕은 비교(주소값만 비교)
 *  
 *  	c. isNull(Object obj)
 *  		-> 객체가 null인지 조사
 *  
 *  	d. nonNull(Object obj)
 *  		-> 객체가 null이 아닌지 조사
 *  
 *  (3) T
 *  	a. requireNonNull(T obj)
 *  		-> 객체가 null인 경우 예외 발생
 *  
 *  	b. requireNonNull(T obj, String message)
 *  		-> 객체가 null인 경우 예외 발생
 *  			(주어진 메세지 포함)
 *  
 *  	c. requireNonNull(T obj, Supplier<String> messageSupplier)
 *  		-> 객체가 null인 경우 예외 발생
 *  			(람다식이 만든 예외 메세지 포함)
 *  
 *  (4) String
 *  	a. toString(Object o)
 *  		-> 객체의 toString() 리턴값 리턴
 *  
 *  	b. toString(Object o, String nullDefault)
 *  		-> 객체의 toString() 리턴값 리턴, 
 *  			첫 번째 매개값이 null일 경우 두 번째 매개값 리턴
 *  
 *  4-1. 객체 비교: Object.compare(T a, T b, Comparator<T> c)
 *  	-> 두 객체를 비교자(Comparator)로 비교해서 int값을 리턴
 * 
 * 
 * 
 */
