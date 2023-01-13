package outOfoption;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoFind {
	private JFrame frame;
	private JPanel p1, p2;
	private JButton btn[];
	private JLabel lb[];
	private JTextField tf[];
	
	public InfoFind() {
		frame = new JFrame("아이디/비밀번호 찾기");
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		btn = new JButton[4];
		for (int i=0; i<btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setFont(new Font("", Font.BOLD, 14));
		}
		btn[0] = new JButton("아이디 찾기");
		btn[1] = new JButton("비밀번호 찾기");
		btn[2] = new JButton("인증번호 보내기");
		btn[3] = new JButton("다음");
		
		lb = new JLabel[4];
		for (int i=0; i<lb.length; i++) {
			lb[i] = new JLabel("", Label.RIGHT);
			lb[i].setFont(new Font("", Font.BOLD, 14));
		}
		lb[0] = new JLabel("이름", Label.RIGHT);
		lb[1] = new JLabel("이메일", Label.RIGHT);
		lb[2] = new JLabel("", Label.RIGHT);
		
		tf = new JTextField[4];
		for (int i=0; i<tf.length; i++) {
			tf[i] = new JTextField();
			tf[i].setFont(new Font("", Font.BOLD, 14));
		}
	}
	
	private void setPanel1() {
		
	}
	
	private void setPanel2() {
		
	}
	
	public void setFrame() {
		frame.setSize(500, 400);
		btn[0].setText("아이디 찾기");
		btn[1].setText("비밀번호 찾기");
		
		frame.setVisible(true);
	}
}
