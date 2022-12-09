package ex06_AWT.Component.Frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest2 {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		Dimension d = f.getSize();
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
//		f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);
		f.setLocation(screenSize.width / 2 - (int) (d.getWidth() / 2),
				screenSize.height / 2 - (int) (d.getHeight() / 2));
//		모니터 해상도에서 정가운데에 화면창이 나오려면, Frame너비와 높이의 절반값을 빼줘야 함

		f.setVisible(true);
	}
}
