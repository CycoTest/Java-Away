package concept;

import java.text.MessageFormat;

public class Format_Class {

}
/*
 * 16. Format 클래스
 * 
 * 16-1. 숫자 형식 클래스: DecimalFormat()
 * 		- 괄호 안에 기호를 넣어 메소드를 완성	
 * 	
 * 	(1) 0 : 10진수, 빈 자리는 0으로 채움
 * 		a. 0          -> 12345
 * 		b. 0.0        -> 12345.6
 * 		c. 000000.000 -> 012345.670
 * 
 * 	(2) # : 10진수, 빈 자리는 채우지 않음
 * 		a. #          -> 12345
 * 		b. #.#        -> 12345.6
 * 		c. ######.### -> 12345.67	
 * 
 * 	(3) . : 소수점
 * 		a. #.0        -> 12345.6
 * 		a. #.00       -> 12345.60
 * 		c. #.#        -> 12345.6
 * 		d. #.##       -> 12345.67
 * 
 * 	(4) - : 음수 기호
 * 		a. +#.0       -> +12345.6
 * 		b. -#.0       -> -12345.6
 * 
 * 	(5) , : 단위 구분
 * 		a. #,###.0    -> 1,234,567.8
 * 		b. #,####.0   -> 123,4567.8
 * 
 * 	(6) E : 지수 문자
 * 		a. 0.0E0      -> 1.2E6
 * 
 * 	(7) ; : 양수와 음수의 패턴을 모두 기술할 경우, 패턴 구분자
 * 		a. +#,### ; -#,###
 * 			-> +1,234,567 (양수일 때)		
 * 			-> -1,234,567 (음수일 때)
 * 
 *	(8) % : 100을 곱한 후에 % 문자를 붙임
 *		a. #.#%       -> 123456789%
 *
 * 	(9) \u00A4 : 통화 기호
 * 		a. \u00A4 #,###
 * 
 * 
 * 16-2. 날짜 형식 클래스: SimpleDateFormat()
 * 		- 괄호 안에 기호를 넣어 메소드를 완성
 * 
 * 	(1) y : 년		a. yyyy년 MM월 dd일
 * 	(2) M : 월		b. yyyy-MM-dd
 * 	(3) d : 일		c. yyyy.MM.dd
 * 
 * 	(4) D : 월 구분이 없는 일(1~365)
 * 	(5) w : 년의 몇 번째 주
 * 	(6) W : 월의 몇 번째 주	
 *  (7) E : 요일
 * 
 * 	(8) a  : 오전/오후
 * 	
 * 	(9) H/h  : 시(0~23)/시(1~12)
 * 	(10) K/k : 시(0~11)/시(1~24)	
 * 		
 * 	(13) m : 분
 * 	(14) s : 초
 * 	(15) S : 밀리세컨드 (1/1000초)
 * 
 * 
 * 16-3. 문자열 형식 클래스: MessageFormat()
 * 		- 괄호 안에 문자열 형식을 넣어 메소드를 완성
 * 	
 * 	(1) 형태1
 * 		String id = "java";
 * 		String name = "홍길동";
 * 		String tel = "010-123-4567";
 * 
 * 		String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
 * 		String result1 = MessageFormat.format(text, id, name, tel);
 * 
 * 	(2) 형태2 - 가장 보편적인 형식
 * 		String sq1 = "insert into member values({0}, {1}, {2})";
 * 		Object[] arguments = { "java", "홍길동", "010-123-4567" };
 * 		String result2 = MessageFormat.format(sq1, arguments);
 * 
 */
