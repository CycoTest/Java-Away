package test.search;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SearchW {
	private Frame frame;
	private Button btn1;
	
	public SearchW() {
		frame = new Frame("의약품 검색");
		btn1 = new Button("검색");
	}
	
	public void setFrame() {
		frame.setSize(600, 800);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		
		frame.add(btn1);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}
}
