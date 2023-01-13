package component.signup.popUp;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mommoo.flat.layout.linear.constraints.LinearConstraints;
import com.mommoo.flat.layout.linear.constraints.LinearSpace;

import component.signup.mail.SendMailver2;

public class EmailCheck {
	private JFrame frame;
	private JLabel lb1, lb2;
	private JTextField tf;
	private JButton btn1, btn2;
	private String verifyNum;
	
	public EmailCheck() {
		frame = new JFrame("이메일 인증");
		
		lb1 = new JLabel("인증 코드", Label.RIGHT);
		lb1.setFont(new Font("", Font.BOLD, 14));
		lb2 = new JLabel("남은 유효 시간: ", Label.RIGHT);
		lb2.setFont(new Font("", Font.BOLD, 14));
		
		tf = new JTextField(8);
		btn1 = new JButton("입력");
		btn1.setFont(new Font("", Font.BOLD, 14));
		btn2 = new JButton("코드 발송");
		btn2.setFont(new Font("", Font.BOLD, 14));
		
		tf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src = (JTextField) ke.getSource();
				if(src.getText().length()>5) {
					ke.consume();
				}
			}
		});
	}
	
	public void setFrame(String toAddress) {
		frame.setSize(400, 200);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose();
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(verifyNum);
				if (tf.getText().equals(verifyNum)) {
					JOptionPane.showMessageDialog(null, "인증 성공!", "이메일 인증 확인",
							JOptionPane.WARNING_MESSAGE);
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "인증 코드가 틀렸습니다.", "이메일 인증 확인",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SendMailver2 goMail = new SendMailver2();

				String getAddress = toAddress;
				goMail.verifyMail(getAddress);
				
				verifyNum = goMail.getRandNum();
			}
		});
		
		lb1.setBounds(60, 40, 80, 23);
		tf.setBounds(140, 40, 80, 23);
		btn1.setBounds(240, 40, 70, 23);
		btn2.setBounds(60, 80, 100, 23);
		
		frame.add(lb1);
		frame.add(tf);
		frame.add(btn1, new LinearConstraints().setLinearSpace(LinearSpace.MATCH_PARENT));
		frame.add(btn2, new LinearConstraints().setLinearSpace(LinearSpace.MATCH_PARENT));
		
		frame.setVisible(true);
	}
}
