package ex03_FlowLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {
	private Frame frame;
	private Button button1, button2, button3;

	public FlowTest() {
		frame = new Frame("FlowLayout example");
		button1 = new Button("확인");
		button2 = new Button("열기");
		button3 = new Button("닫기");
	}

	public void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest flow = new FlowTest();
		flow.startFrame();
	}
}
/*
 * FlowLayout의 특징
 * 
 * 1) 창 크기와 상관 없이 버튼 크기는 그대로다
 * 
 * 2) 버튼을 일렬로 배치하지 못할 만큼의 창 크기가 될 경우,
 * 		버튼을 순차적으로 밑으로 내려서 정렬한다
 * 
 */
