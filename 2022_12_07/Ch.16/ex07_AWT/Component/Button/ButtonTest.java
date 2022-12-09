package ex07_AWT.Component.Button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 300);
		f.setLayout(null);

		Button b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100, 75);

		f.add(b);
		f.setVisible(true);
	}
}
