package ex04_AWT.Component.ScrollPane;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollPaneTest {
	public static void main(String[] args) {
		Frame f = new Frame("ScrollPane Test");
		f.setSize(300, 200);

		ScrollPane sp = new ScrollPane();
		Panel p = new Panel();
		p.setBackground(Color.pink);
		p.add(new Button("1st"));
		p.add(new Button("2nd"));
		p.add(new Button("3rd"));
		p.add(new Button("4th"));

		sp.add(p);
		f.add(sp);
		f.setVisible(true);
	}
}
/*
 * ScrollPane sp = new ScrollPane();
 * 	-> 괄호 안에 넣을 수 있는 키워드
 * 		1. ScrollPane.SCROLLBARS_ALWAYS: 스크롤바가 항상 보이게 함
 * 		2. ScrollPane.SCROLLBARS_AS_NEEDED: 필요할 때만 보이게 함
 * 		3. ScorllPane.SCROLLBARS_NEVER: 항상 보이지 않도록 함
 * 
 * 
 * 
 * 
 */

