package ex07_Perspective.EventHandler.Different;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Button1")) {
			System.out.println("Button 1 Click!");
		}

		if (e.getActionCommand().equals("Button2")) {
			System.out.println("Button 2 Click!");
		}

		if (e.getActionCommand().equals("Button3")) {
			System.out.println("Button 3 Click!");
		}

		if (e.getActionCommand().equals("Button4")) {
			System.out.println("Button 4 Click!");
		}

		if (e.getActionCommand().equals("Button5")) {
			System.out.println("Button 5 Click!");
		}
	}
}
