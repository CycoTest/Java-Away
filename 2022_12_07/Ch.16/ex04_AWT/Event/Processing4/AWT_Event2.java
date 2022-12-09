package ex04_AWT.Event.Processing4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_Event2 {
	private Frame frame;
	private Button btn1, btn2, btn3, btn4, btn5;

	public AWT_Event2() {
		frame = new Frame("Event Handler example");
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	public void startFrame() {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button1 Click!");
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button2 Click!");
			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button3 Click!");
			}
		});

		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button4 Click!");
			}
		});

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button5 Click!");
			}
		});

		frame.add(btn1, "North");
		frame.add(btn2, "South");
		frame.add(btn3, "West");
		frame.add(btn4, "East");
		frame.add(btn5, "Center");

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		AWT_Event2 anonymous = new AWT_Event2();

		anonymous.startFrame();
	}
}
