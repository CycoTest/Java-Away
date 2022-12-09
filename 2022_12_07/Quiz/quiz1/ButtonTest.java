package quiz1;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class ButtonTest extends WindowAdapter {
	private Frame frame;
	private Button btn1, btn2;

	public ButtonTest() {
		frame = new Frame("Login");
		btn1 = new Button("Ok");
		btn2 = new Button("Close");
	}

	public void startFrame() {
		btn1.addActionListener(new ActionListener() {
			private int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn1 Click!");
				setCount(getCount() + 1);
				System.out.println(count);
				if (count % 2 == 1) {
					btn1.setLabel("Ok");
				} else {
					btn1.setLabel("Cancel");
				}
			}

			public int getCount() {
				return count;
			}

			public void setCount(int count) {
				this.count = count;
			}

		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});

		btn1.setPreferredSize(new Dimension(80, 50));
		btn2.setPreferredSize(new Dimension(80, 50));

		frame.setLayout(new FlowLayout());

		frame.add(btn1);
		frame.add(btn2);

		frame.setSize(300, 300);
		Dimension d = frame.getSize();

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		frame.setLocation(screenSize.width / 2 - (int) (d.getWidth() / 2),
				screenSize.height / 2 - (int) (d.getHeight() / 2));
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		ButtonTest show = new ButtonTest();

		show.startFrame();
	}
}
