package ex03_AWT.Event.Processing3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest {
	private Frame f;
	private Button btn1, btn2, btn3, btn4, btn5;

	public BorderTest() {
		f = new Frame("Event Handler example");
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	public class InnerHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Button1")) {
				System.out.println("Button 1 Click!");
			}

			if (e.getActionCommand().equals("Button2")) {
				System.out.println("Button 2 Click!");
			}

			if (e.getActionCommand().equals("Button3")) {
				System.out.println("Button 3 Click!");
			}

			if (e.getActionCommand().equals("Button4")) {
				System.out.println("Button 4 Click!");
			}

			if (e.getActionCommand().equals("Button5")) {
				System.out.println("Button 5 Click!");
			}
		}
	}

	public void startFrame() {
		btn1.addActionListener(new InnerHandler());
		btn2.addActionListener(new InnerHandler());
		btn3.addActionListener(new InnerHandler());
		btn4.addActionListener(new InnerHandler());
		btn5.addActionListener(new InnerHandler());

		f.add(btn1, "North");
		f.add(btn2, "South");
		f.add(btn3, "West");
		f.add(btn4, "East");
		f.add(btn5, "Center");

		f.setSize(300, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest innerHandler = new BorderTest();

		innerHandler.startFrame();
	}
}
