package ex01_AWT.definition;

import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		Frame f = new Frame("Frame Demo");
//		윈도우창 이름 지정

		f.setSize(300, 200);
//		처음 나오는 창의 크기 지정
		f.setVisible(true);
//		화면창 출력 여부 지정
	}
}
/*
 * 출력된 화면창을 끄는 방법
 * 
 * 1) '창 닫기' 코드를 새로히 작성하여 기능을 추가
 * 
 * 2) 이클립스, Console창에서 실행 중인 프로그램을 
 * 		강제 종료하는 버튼인 Terminate(빨간 네모 버튼)를 누름
 * 
 * 3) 윈도우-작업 관리자,
 * 		OpenJDK Platform binary 프로그램을 선택하고 작업 끝내기
 * 
 */

