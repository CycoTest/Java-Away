package ex02_BorderLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderTest {
	private Frame frame;
	private Button center, west, east, south;
	private TextField tf1;

	public BorderTest() {
		frame = new Frame("BorderLayout example");
		south = new Button("button 1");
		west = new Button("button 2");
		east = new Button("button 3");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("입력창입니다.");
	}

	public void startFrame() {
		frame.add(tf1, "North");
		frame.add(south, BorderLayout.SOUTH);
		frame.add(west, "West");
		frame.add(east, "East");
		frame.add(center, BorderLayout.CENTER);
//		각 방향을 문자열 형식으로 입력해도 되지만
//		BorderLayout의 상수로 불러도 됨
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFrame();
	}
}
