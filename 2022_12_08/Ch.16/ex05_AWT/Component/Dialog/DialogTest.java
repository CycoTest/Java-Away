package ex05_AWT.Component.Dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class DialogTest {
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);

		Dialog info = new Dialog(f, "Information", true);
//		true일 경우, 포커싱이 Dialog창을 벗어나면 Dialog창을 반짝이며 강조시키고, 
//		Dialog창을 제외한 나머지에 포킹이 안 됨
		
		
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());

		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");
		info.add(msg);
		info.add(ok);

		f.setVisible(true);
		info.setVisible(true);
	}
}
