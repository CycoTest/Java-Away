package ex05_Adapter.Class;

import java.awt.Button;
//import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest_Inheritance_BorderLayout extends WindowAdapter {
	private Frame frame;
	private Button button1, button2, button3;

	public FlowTest_Inheritance_BorderLayout() {
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
//		frame.setLayout(new FlowLayout());
//		frame의 디폴트값: BorderLayout
//		new FlowLayout을 함으로써 디폴트값을 바꿈
		
		frame.setLayout(null);
//		frame의 디폴트값을 초기화
//		frame의 디폴트값: BorderLayout
		
		button1.setSize(50, 50);
		button1.setLocation(10, 30);
		frame.add(button1);

		button2.setSize(50, 50);
		button2.setLocation(70, 30);
		frame.add(button2);

		button3.setSize(50, 50);
		button3.setLocation(130, 30);
		frame.add(button3);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest_Inheritance_BorderLayout adapter 
			= new FlowTest_Inheritance_BorderLayout();

		adapter.startFrame();
	}
}
