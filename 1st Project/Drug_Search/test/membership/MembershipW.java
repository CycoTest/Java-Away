package test.membership;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MembershipW {
	private JFrame frame;
	private JPanel p[];
	private JButton btn[];
	
	public MembershipW() {
		frame = new JFrame("의약품 검색기");
		
		p = new JPanel[3];
		for (int i=0; i<p.length; i++) {
			p[i] = new JPanel();
		}
		
		btn = new JButton[3];
		for (int i=0; i<btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setSize(80, 80);
		}
	}

	private Component setPanel1() {
		p[0].setSize(450, 100);
		p[0].setLayout(null);
		p[0].setLocation(0, 0);
		p[0].setBackground(Color.cyan);
		
		btn[0].setText("입장");
		btn[0].setLocation(150, 30);
		
		return p[0];
	}
	
	private Component setPanel2() {
		p[1].setSize(225, 150);
		p[1].setLayout(null);
		p[1].setLocation(0, 100);
		p[1].setBackground(Color.blue);
		
		btn[1].setText("마약");
		btn[2].setLocation(50, 60);
		
		return p[1];
	}
	
	private Component setPanel3() {
		p[2].setSize(225, 150);
		p[2].setLayout(null);
		p[2].setLocation(225, 100);
		p[2].setBackground(Color.green);
		
		btn[2].setText("의약");
		btn[2].setLocation(50, 60);
		return p[2];
	}
	
	public void setFrame() {
		frame.setSize(450, 400);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		frame.getBackground();
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		frame.add(setPanel1());
		frame.add(setPanel2());
		frame.add(setPanel3());
		
		frame.setVisible(true);
	}
	
}
