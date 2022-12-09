package concept_AWT;

public class AWT_Component {

}
/*
 * 4. AWT Component
 * 
 * 	1) Frame의 메소드(혹은 생성자)
 * 
 * 		a. Frame(String title)
 * 			-> Frame을 생성
 * 			-> title : Frame의 titlebar에 보여질 text(String)
 * 
 * 		b. String getTitle()
 * 			-> titlebar에 있는 text를 얻음
 * 
 * 		c. void setTitle(String title)
 * 			-> titlebar의 text를 변경
 * 
 * 		d. void setTitle(int state)
 * 			-> Frame의 상태를 변경할 수 있으며, state에는 아래의 두 가지 값 중 하나를 사용 가능
 * 					d-1. Frame.ICONIFIED
 * 							- Frame의 최소화 상태가 되게 함
 * 
 * 					d-2. Frame.NORMAL
 * 							- Frame의 정상적인 상태(최소화 이전상태)가 되게 함
 * 
 * 		e. int getState()
 * 			-> Frame의 현재 상태를 알 수 있음
 * 
 * 		f. void setResizable(boolean resizable)
 * 			-> Frame의 크기를 변경 가능 or 불가능하게 함
 * 				(resizable의 값이 false로 하면 사용자가 Frame의 크기를 변경할 수 없음)
 * 
 * 
 * 	2) Button의 메소드(혹은 생성자)
 * 
 * 		a. Button(String label)
 * 			-> 지정된 label을 가진 Button을 생성
 * 			-> label : Button 위에 나타날 text(String)
 * 
 * 		b. String getLabel() 
 * 			-> Button에 나타나있는 text를 얻음
 * 		
 * 		c. void setLabel(String label)
 * 			-> Button에 나타나있는 text를 변경
 * 
 * 	
 * 	3) Choice의 메소드(혹은 생성자)
 * 
 * 		a. void add(String item)
 * 			-> Choice에 item을 추가
 * 
 * 		b. void remove(String item)
 * 			-> Choice에 item을 제거
 * 
 * 		c. void remove(int index)
 * 			-> 지정된 순서에 있는 item을 제거
 * 
 * 		d. void removeAll() 
 * 			-> Choice의 모든 item을 제거
 * 
 * 		e. void insert(String item, int index)
 * 			-> 지정된 순서에 item을 추가
 * 
 * 		f. String getitem(int index)
 * 			-> 지정된 순서에 item을 얻음
 * 
 * 		g. int getitemCount()
 * 			-> 현재 Choice에 추가되어 있는 item이 몇 개인지 알려줌
 * 
 * 		h. int getSelectedIndex()
 * 			-> 현재 선택되어져 있는 item의 index값을 얻음
 * 
 * 		i. String getSelectedItem()
 * 			-> 현재 선택되어져 있는 item을 얻음
 * 
 * 
 * 	4) List의 메소드(혹은 생성자)
 * 
 * 		a. List(int rows, boolean multipleMode)
 * 			-> rows : 몇 줄짜리 크기의 List를 보여줄 것인지 지정
 * 			-> multipleMode : List 목록 다중선택이 가능하도록 할 것인지 지정
 * 
 * 		b. void add(String item)
 * 			-> item을 List에 추가
 * 
 * 		c. void add(String item, int index)
 * 			-> 지정된 위치(index)에 item을 추가
 * 
 * 		d. void remove(String item)
 * 			-> List에서 해당 item을 제거
 * 
 * 		e. int getRows()
 * 			-> List에 scroll 없이 볼 수 있는 item의 수를 얻음
 * 	
 * 		f. String getitem(int index)
 * 			-> Index : 지정된 위치에 있는 item을 얻음
 * 
 * 		g. String[] getSelectedItems()
 * 			-> 현재 선택되어 있는 item들의 얻음
 * 				(List의 multipleMode가 true인 경우)
 * 
 * 
 * 	5) Label의 메소드(혹은 생성자)
 * 
 * 		a. Label(String text, int alignment)
 * 			-> text : 화면에 나타낼 글(text)을 String으로 넣음
 * 			-> alignment : text의 정렬 방식을 지정
 * 				(Label.LEFT, Label.CENTER, Label.RIGHT 중 택 1)
 * 
 * 		b. Label(String text)
 * 			-> text : 화면에 나타낼 text를 지정
 * 				(alignment의 기본값인 Label.LEFT로 설정)
 * 
 * 		c. 
 * 
 * 
 * 	6) Checkbox
 * 
 * 
 * 	7) TextField
 * 
 * 
 * 
 * 
 * 
 * 
 */
