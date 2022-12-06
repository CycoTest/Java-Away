package ex04_GridLayout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridTest {
	private Frame frame;
	private Button b1, b2, b3;
	private TextField tf1, tf2, tf3;

	public GridTest() {
		frame = new Frame("GridLayout example");
		b1 = new Button("button 1");
		b2 = new Button("button 2");
		b3 = new Button("button 3");

		tf1 = new TextField("Input Text 1");
		tf2 = new TextField("Input Text 2");
		tf3 = new TextField("Input Text 3");
	}

	public void startFrame() {
		frame.setLayout(new GridLayout(3, 0));
		frame.add(b1);
		frame.add(tf1);
		frame.add(b2);
		frame.add(tf2);
		frame.add(b3);
		frame.add(tf3);

		
//		frame.setSize(200, 200);
//		frame.setLocation(2600,100);
		frame.pack();
//		출력창의 크기를 원래 지정해야 한다
//		34번, 35번 라인과 같이 일일이 지정하기 귀찮을 경우, 36번 라인의 코드를 이용하면 됨
//		.pack()이 갖는 의미: 
//			선언한 변수들이 갖는 최소 데이터를 포함한 크기 만큼의 화면창을 자동으로 지정함
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GridTest grid = new GridTest();
		grid.startFrame();
	}
}
