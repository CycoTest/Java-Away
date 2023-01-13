package outOfoption;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import component.signup.addon.SPanel1;
import component.signup.addon.SPanel2;
import component.signup.addon.SignUpCheck;
import window.SignUpW;

public class Panel4 {
	private JPanel p4;
	private JButton btn1, btn2, btn3;
	
	public Panel4() {
		p4 = new JPanel();
		
		btn1 = new JButton("회원가입");
		btn2 = new JButton("취소");
		btn3 = new JButton("돌아가기");
	}
	
	public Component setPanel4Component() {
		p4.setBounds(0, 540, 500, 60);
		p4.setLayout(null);
		p4.setBackground(Color.cyan);
		
		btn1.setBounds(60, 10, 100, 30);
		btn2.setBounds(210, 10, 80, 30);
		btn3.setBounds(340, 10, 100, 30);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SignUpW frame = new SignUpW();
				SignUpCheck signCheck = new SignUpCheck(frame.getFrame());
				
				signCheck.setVisible(true);
				
				if(signCheck.memberCheck()) {
					SPanel1 p1 = new SPanel1();
					SPanel2 p2 = new SPanel2();
					SPanel3 p3 = new SPanel3();
					Panel4 p4 = new Panel4();
					
					p1.setText(null);
					
				}
			}
		});
		
		p4.add(btn1);
		p4.add(btn2);
		p4.add(btn3);
		
		return p4;
	}
}
