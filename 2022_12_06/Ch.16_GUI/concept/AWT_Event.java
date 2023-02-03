package concept;

public class AWT_Event {

}
/*
 * 3. AWT Event
 * 
 * 	1) 정의
 * 		-> 자바 화면에서 사용자가 발생시키는 행위나 시스템이 
 * 			자체적으로 발생시키는 모든 행위
 * 	
 * 		(1) Event Source
 * 			- Event를 발생시키는 Component
 * 
 * 		(2) Event Handler
 * 			- Event 발생시 작업을 수행하는 주체(클래스)
 * 
 * 		(3) Event Listener
 * 			- Event Source에서 Event 발생 유무를 체크
 * 				-> interface로 제공되고 
 * 					실제 Event를 처리하는 추상 메소드를 갖고 있음
 * 
 * 	2) Java Event 처리 과정
 * 		(1) 자바 프로그램 실행 중에 운영체제가 프로그램에 Event 발생 유무를 체크
 * 		(2) Event가 발생하면 운영체제는 JVM에게 Event 발생을 알림
 * 		(3) JVM은 Event 발생을 분석한 후 적절한 Event 객체를 생성
 * 		(4) JVM은 Event 객체를 Event Listener를 구현한 Event Handler에게 전달
 * 		(5) Event Handler는 Event 객체를 받아 적절히 처리
 * 
 *  3) java.awt.evet 종류
 * 		- 특정 조건을 만족하여야 Event가 발생
 * 
 * 		(1) ActionEvent
 * 			-> 버튼, 리스트, 메뉴 등의 Component가 눌리거나 선택됐을 때 
 * 		
 * 		(2) AdjustmentEvent
 * 			-> 스크롤바와 같은 조정 가능한 Component에서 조정이 일어나면 
 * 
 * 		(3) ComponentEvent
 * 			-> Component의 모습, 이동, 크기가 변화될 때 
 * 
 * 		(4) ItemEvent
 * 			-> 리스트와 같은 선택 항목이 있는 Component에서 선택 항목이 선택됐을 때
 * 
 * 		(5) TextEvent
 * 			-> 텍스트 Component에서 값이 입력될 때
 * 
 * 		(6) ContainerEvent
 * 			-> Container에서 Component가 추가되거나 제거될 때 
 * 
 * 		(7) FocusEvent
 * 			-> Component에 초점(Focus)이 들어올 때
 * 
 * 		(8) PaintEvent
 * 			-> Component가 그려져야 할 때
 * 		
 * 		(9) WindowEvent
 * 			-> 윈도우가 활성화되거나 비활성화될 떄, 최소화, 최대화, 종료될 때
 * 
 * 		(10) KeyEvent
 * 			-> 키보드로부터 입력될 때
 * 		
 * 		(11) MouseEvent
 * 			-> 마우스가 눌려지거나 움직일 때, 
 * 				마우스 커서가 Component 영역에 들어가거나 벗어날 때
 * 	
 * 	4) AWT Event 구동방법
 * 
 * 		(1) 화면Class와 Event Handler Class가 같은 경우
 * 			
 * 			-> 동일한 클래스 내부에 
 * 
 * 			ex) ex06
 * 
 * 		(2) 화면Class와 Event Handler Class가 다른 경우
 * 
 * 			->
 * 
 * 			ex) ex07
 * 
 * 		(3) 내부Class를 Event Handler Class로 사용하는 경우
 * 	
 * 		(4) Event Handler Class를 익명의 클래스로 사용하는 경우
 * 
 */
