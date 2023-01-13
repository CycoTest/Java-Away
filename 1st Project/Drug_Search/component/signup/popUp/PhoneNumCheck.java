package component.signup.popUp;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PhoneNumCheck {
	private JFrame frame;
	private JLabel lb;
	private JTextField tf;
	private JButton btn;
	
	public PhoneNumCheck() {
		frame = new JFrame("인증 번호");
		lb = new JLabel("인증 번호", Label.RIGHT);
		tf = new JTextField(7);
		btn = new JButton("확인");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	public void setFrame() {
		frame.setSize(400, 200);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		lb.setBounds(110, 30, 60, 23);
		tf.setBounds(190, 30, 100, 23);
		btn.setBounds(150, 80, 80, 30);
		
		frame.add(lb);
		frame.add(tf);
		frame.add(btn);
		
		frame.setVisible(true);
	}
}
