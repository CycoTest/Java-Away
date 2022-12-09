package concept;

public class AWT_Component {

}
/*
 * 4. AWT Component
 * 
 * 	8) TextArea의 메소드(혹은 생성자)
 * 		
 * 		a. TextArea(String text, int row, int col, int scrollbar)
 * 			-> text : TextArea에 보여질 text 지정
 * 			-> row : TextArea의 줄(row) 수를 지정
 * 			-> col : TextArea의 열(column) 수를 지정
 * 			-> scrollbar : TextArea에 사용할 scrollbar의 종류와 사용 여부 지정
 * 				- TextArea.SCROLLBARS_BOTH
 * 				- TextArea.SCROLLBARS_NONE
 * 				- TextArea.SCROLLBARS_HORIZONTAL_ONLY
 * 				- TextArea.SCROLLBARS_VERTICAL_ONLY
 * 		
 * 		b. int getRows()
 * 			-> TextArea의 행(row) 개수를 얻음
 * 
 * 		c. String getText()
 * 			-> TextArea의 text를 얻음
 * 
 * 		d. void replaceRange(String str, int start, int end)
 * 			-> TextArea에 있는 text의 start부터 end 범위에 있는 
 * 				문자열을 str에 지정된 값으로 변경
 * 
 * 
 * 	9) Scrollbar
 *		 
 *		a. Scrollbar() / Scrollbar(int orientation) / 
 *			Scrollbar(int orientation, int value, int visible, int min, int max)
 *			
 *			-> orientation : Scrollbar의 종류 지정
 *			-> Scrollbar.VERTICAL, Scrollbar.HORIZONTAL 중 하나
 *			-> value : Scrollbar의 초기값
 *			-> visible : Scroll버튼(bubble)의 크기
 *			-> min : Scrollbar가 가질 수 있는 최소값
 *			-> max : Scrollbar가 가질 수 있는 최대값
 *
 *		b. int getValue()
 *			-> 현재 설정된 Scrollbar의 값을 얻어옴
 *
 *		c. void setvalue(int newValue)
 *			-> Scrollbar의 값을 지정된 값(newValue)으로 설정
 *
 * 
 * 	10) Canvas
 * 
 *		 
 *  11) ScrollPane
 *  		
 *  	a. ScrollPane(int scrollbarDisplayPolicy)
 *  		-> scrollbarDisplayPolicy : 아래 값 중 하나를 지정
 *  			- SCROLLBARS_ALWAYS = 스크롤바가 항상 보이게 함
 *  			- SCROLLBARS_AS_NEEDED = 필요할 때만 보이게 함
 *  			- SCROLLBARS_NEVER = 항상 보이지 않도록 함
 *  
 *  	b. ScrollPane()
 *  		-> ScrollPane의 객체 생성
 *  
 *  
 *  12) Dialog
 *  	
 *  	a. Dialog(frame parent, String title, Boolean modal)
 *  		-> parent : 어떤 Frame에 속할 것인지 지정
 *  		-> title : Dialog의 titlebar에 나타날 text 지정
 *  		-> modal : Dialog의 modal(필수응답)로 할 것인지를 지정
 *  
 *  	b. void show()
 *  		-> Dialog가 화면에 나타나도록 함
 *  
 *  	c. void hide()
 *  		-> Dialog가 화면에 보이지 않도록 함
 *  
 *  	d. void dispose()
 *  		-> Dialog를 닫음 (화면에 안 보이게 한 후, 메모리에서 제거)
 *  
 *  
 *  13) FileDialog
 *  
 *  
 *  14) Menu
 *  
 *  
 *  15) PopupMenu
 *  
 *  
 *  
 */
