package ex01_Log.In;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopUp {
	private Frame pop;
	private Label result1;
	private Label result2;
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void popSuccess() {
		pop = new Frame("Success?");
		pop.setSize(50, 50);
		pop.setResizable(false);
		pop.setLocationRelativeTo(null);
		
		result1 = new Label("Sign-in Success!!");
		pop.add(result1);
		
		pop.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				pop.dispose();
			}
		});
		
		pop.setVisible(true);
	}
	
	public void popFail() {
		pop = new Frame("Success?");
		pop.setSize(100, 100);
		pop.setResizable(false);
		pop.setLocationRelativeTo(null);
		
		result2 = new Label("Sign-in Fail...");
		pop.add(result2);
		
		pop.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				pop.dispose();
			}
		});
		
		pop.setVisible(true);
	}
}
