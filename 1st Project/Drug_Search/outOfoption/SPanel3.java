package outOfoption;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import component.signup.addon.SPanel2;
import component.signup.mail.SendMailver1;

public class SPanel3 {
	private JPanel p3;
	private JLabel lb, inlb;
	private JTextField tf;
	private JButton btn;
	
	public SPanel3() {
		p3 = new JPanel();
		
		lb = new JLabel("자동 등록 방지", Label.RIGHT);
		inlb = new JLabel("인증한 이메일로 등록방지 코드 전송 완료", Label.RIGHT);
		tf = new JTextField(8);
		btn = new JButton("입력");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	private void showCondition() {
		inlb.setFont(new Font("", Font.BOLD, 14));
		inlb.setForeground(Color.red);
		inlb.setBounds(120, 45, 300, 23);
		inlb.setVisible(false);
		
		p3.add(inlb);
	}
	
	public Component setPanel3Component() {
		p3.setBounds(0, 450, 500, 90);
		p3.setLayout(null);

		lb.setFont(new Font("", Font.BOLD, 14));
		lb.setBounds(35, 15, 100, 30);
		tf.setBounds(140, 20, 160, 23);
		btn.setBounds(320, 18, 70, 23);
		btn.setFont(new Font("", Font.BOLD, 14));
		
		showCondition();
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SPanel2 p2 = new SPanel2();
				SendMailver1 sendCode = new SendMailver1();

				inlb.setVisible(true);
				String email = p2.getEmailText();
				sendCode.verifyMail(email);
			}
		});
		
		p3.add(lb);
		p3.add(tf);
		p3.add(btn);
		
		return p3;
	}
	
	public String getCheatBlockText() {
		String getBox = tf.getText().trim();
		System.out.println(getBox);
		return getBox;
	}
	
	public String setText(String text) {
		return text;
	}
}
