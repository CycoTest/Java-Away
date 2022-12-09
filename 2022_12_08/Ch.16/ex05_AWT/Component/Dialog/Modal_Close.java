package ex05_AWT.Component.Dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Modal_Close extends WindowAdapter {
	private Frame frame;
	private Dialog info;
	private Button ok;
	
	Modal_Close() {
		frame = new Frame("Parent");
		info = new Dialog(frame, "Information", true);
		ok = new Button("OK");
	}

	
	public void startFrame() {
		frame.setSize(300, 200);
		
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		
		Label msg = new Label("This is modal Dialog", Label.CENTER);
		info.addWindowListener(this);
		info.add(msg);
		info.add(ok);
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				info.dispose();
			}
		});

		frame.setVisible(true);
		info.setVisible(true);
	}
	

	public static void main(String[] args) {
		Modal_Close focus = new Modal_Close();
		
		focus.startFrame();
	}
}
