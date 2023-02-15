package ex01_Log.In;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class logGet extends WindowAdapter {
	private Frame frame;
	
	public void startframe() {
		frame = new Frame("Log-In");
		frame.setSize(600, 150);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(3, 1));
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		logInfo set = new logInfo();
		
		frame.add(set.panelUpSetting());
		frame.add(set.panelDownSetting());
		frame.add(set.bottomText());
		
		frame.setVisible(true);
	}
}
