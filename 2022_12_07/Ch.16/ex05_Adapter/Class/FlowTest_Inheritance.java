package ex05_Adapter.Class;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest_Inheritance extends WindowAdapter {
	private Frame frame;
	private Button button1, button2, button3;

	public FlowTest_Inheritance() {
		frame = new Frame("Adapter example");
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());
//		frame의 디폴트값: BorderLayout
//		new FlowLayout을 함으로써 디폴트값을 바꿈

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest_Inheritance adapter = new FlowTest_Inheritance();

		adapter.startFrame();
	}
}
