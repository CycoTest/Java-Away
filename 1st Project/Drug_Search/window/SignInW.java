package window;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import database.openDB.MemberDTO;
import database.sign.SignInDAO;
import test.find.id.pw.InfoFind;
import test.membership.MembershipW;

public class SignInW {
	private Frame frame;
	private JLabel[] lb;
	private JTextField tf;
	private JPasswordField ptf;
	private JButton[] btn;
	private MemberDTO dto;

	public SignInW() {
		frame = new Frame("로그인");

		lb = new JLabel[3];
		lb[0] = new JLabel("아이디");
		lb[1] = new JLabel("비밀번호");
		lb[2] = new JLabel("코드");
		for (int i = 0; i < lb.length; i++) {
			lb[i].setFont(new Font("", Font.BOLD, 15));
		}

		tf = new JTextField(15);
		ptf = new JPasswordField(15);

		btn = new JButton[4];
		btn[0] = new JButton("회원가입");
		btn[1] = new JButton("로그인");
		btn[2] = new JButton("ID/PW 찾기");
		btn[3] = new JButton("돌아가기");
		
		dto = new MemberDTO();
	}
	
	private void comID() {
		lb[0].setBounds(100, 60, 60, 30);
		tf.setBounds(160, 65, 220, 25);
		
		tf.setFocusTraversalKeysEnabled(false);
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_TAB) {
					ptf.requestFocus();
				}
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					tf.setText("");
				}
			}
		});
		
		frame.add(tf);
	}
	
	private void comPW() {
		lb[1].setBounds(85, 100, 70, 30);
		ptf.setBounds(160, 105, 220, 25);
		
		ptf.setFocusTraversalKeysEnabled(false);
		ptf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_TAB) {
					tf.requestFocus();
				}
			}
		});

		frame.add(ptf);
	}
	
	private void comCode() {
		lb[2].setBounds(115, 140, 50, 30);
		
		JRadioButton crime = new JRadioButton("C");
		crime.setSelected(true);
		crime.setFont(new Font("", Font.BOLD, 14));
		crime.setBounds(160, 140, 40, 30);
		JRadioButton treat = new JRadioButton("T");
		treat.setSelected(false);
		treat.setFont(new Font("", Font.BOLD, 14));
		treat.setBounds(250, 140, 40, 30);
		JRadioButton rest = new JRadioButton("R");
		rest.setSelected(false);
		rest.setFont(new Font("", Font.BOLD, 14));
		rest.setBounds(340, 140, 40, 30);
		
		ButtonGroup job = new ButtonGroup();
		job.add(crime);
		job.add(treat);
		job.add(rest);
		
		frame.add(crime);
		frame.add(treat);
		frame.add(rest);
	}
	
	private void Button() {
		btn[0].setBounds(160, 200, 100, 30);
		btn[1].setBounds(280, 200, 100, 30);
		btn[2].setBounds(160, 230, 100, 30);
		btn[3].setBounds(280, 230, 100, 30);
		
		// 회원가입
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SignUpW sign = new SignUpW();
				frame.dispose();
				
				sign.setFrame();
			}
		});
		
		// 로그인
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SignInDAO log = new SignInDAO();
				MembershipW select = new MembershipW();
				
				if (log.in(getID(), getPW()) > 0) {
					JOptionPane.showMessageDialog(null, "로그인 성공!", "로그인 확인", 
							JOptionPane.INFORMATION_MESSAGE);
					
					frame.dispose();
					select.setFrame();
				} else {
					JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호가 잘못됐습니다", "로그인 확인", 
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		// ID/PW 찾기
		btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InfoFind find = new InfoFind();
				
				find.setFrame();
				frame.dispose();
			}
		});
		
		// 돌아가기
		btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberCheckW choice = new MemberCheckW();
				frame.dispose();
				
				choice.setFrame();
			}
		});
		
		for (int i = 0; i < btn.length; i++) {
			frame.add(btn[i]);
		}
	}
	
	public void setFrame() {
		frame.setSize(500, 300);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setBackground(new Color(204, 204, 204));

		comID();
		comPW();
		comCode();
		Button();
		
		for (int i = 0; i < lb.length; i++) {
			frame.add(lb[i]);
		}
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});

		frame.setVisible(true);
	}
	
	public String getID() {
		dto.setId(tf.getText().trim());
		return dto.getId();
	}
	
	public String getPW() {
		dto.setPW(ptf.getPassword().toString().trim());
		return dto.getPW();
	}
}
