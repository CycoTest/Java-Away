package ex08_AWT.Component.Choice;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest {
	public static void main(String[] args) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300, 200);
		f.setLayout(null);

		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");

		day.setSize(100, 50);
		day.setLocation(100, 70);
//		f.setLayout(null); 로 선언했기 때문에 위치 지정을 해주는 코드가 필요

		f.add(day);
		f.setVisible(true);
	}
}
