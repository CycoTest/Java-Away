package component.signup.addon;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton button = (JButton) e.getSource();
		String sex = button.getText().trim();
		
		if (sex.equals("남자")) {
			button.setBackground(Color.darkGray);
			button.setForeground(Color.white);
		} else if (sex.equals("여자")) {
			button.setBackground(Color.darkGray);
			button.setForeground(Color.white);
		} else {
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}
