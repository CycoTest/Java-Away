package concept_AWT;

public class Adapter {

}
/*
 * 3. AWT Event
 * 
 * 	5) Adapter 클래스
 * 		
 * 		(1) Adapter 클래스의 정의와 용도
 * 			
 * 			a. 정의
 * 				- 2개 이상의 추상 메소드를 가진 Listener Interface를 미리 구현한 클래스
 * 		
 * 			b. 용도
 * 				- Listener Interface를 이용하여 Event Handler를 구현하면
 * 					사용되지 않은 추상 메소드를 구현해줘야 함
 * 
 * 				- Adapter 클래스를 사용하면 필요하지 않은 추상 메소드는 구현하지 않아도 됨
 * 
 * 		(2) 여러 개의 추상 메소드가 선언된 Listener
 * 
 * 			a. ActionListener
 * 				-> actionPerformed(ActionEvent)
 *
 * 			b. MouseListener
 * 				-> mouseClicked(MouseEvent)
 * 				-> mouseEntered(MouseEvent)
 * 				-> mouseExited(MouseEvent)
 * 				-> mousePressed(MouseEvent)
 * 				-> mouseReleased(MouseEvent)
 * 
 * 			c. WindowListener
 * 				-> windowOpened(WindowEvent)
 * 				-> windowClosing(WindowEvent)
 * 				-> windowClosed(WindowEvent)
 * 				-> windowActivated(WindowEvent)
 * 				-> windowDeactivated(WindowEvent)
 * 				-> windowIconified(WindowEvent)
 * 				-> windowDeiconified(WindowEvent)
 * 
 */
