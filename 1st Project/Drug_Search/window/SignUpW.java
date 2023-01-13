package window;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import component.signup.addon.SPanel1;
import component.signup.addon.SPanel2;
import database.sign.SignUpDAO_v2;

public class SignUpW {
	private Frame frame;
	private JPanel bottomP;
	private JButton[] btn;
	
	public SignUpW() {
		frame = new Frame("회 원 가 입");
		bottomP = new JPanel();

		btn = new JButton[3];
		btn[0] = new JButton("회원가입");
		btn[1] = new JButton("취소");
		btn[2] = new JButton("돌아가기");
	}
	
	public void setFrame() {
		frame.setSize(500, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		SPanel1 p1 = new SPanel1();
		SPanel2 p2 = new SPanel2();
//		SPanel3 p3 = new SPanel3();
		
		frame.add(p1.setPanel1Component());
		frame.add(p2.setPanel2Component());
//		frame.add(p3.setPanel3Component());
		
		bottomP.setBounds(0, 450, 500, 60);
		bottomP.setLayout(null);
		
		for (int i=0; i<btn.length; i++) {
			btn[i].setFont(new Font("", Font.BOLD, 14));
		}
		btn[0].setBounds(60, 10, 100, 30);
		btn[1].setBounds(210, 10, 80, 30);
		btn[2].setBounds(340, 10, 100, 30);
		
		// 회원가입
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userId = p1.getIdText();
				String userPassword = p1.getPwText(); 
				String PasswordCheck = p1.getPwCheckText(); 
				String userName = p2.getNameText();
				String userGender = p2.getGednderText();
				String userEmail = p2.getEmailText();
				String userJob = p2.getJobText();
				
				Pattern passPattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,16}$");
				Matcher passMatcher = passPattern.matcher(userPassword);
				if (!passMatcher.find()) {
					JOptionPane.showMessageDialog(null, "비밀번호 생성 조건을 맞추셔야 합니다", "비밀번호 오류", 1);
				} else if (!PasswordCheck.equals(userPassword)) {
					JOptionPane.showMessageDialog(null, "비밀번호가 서로 일치하지 않습니다", "비밀번호 오류", 1);
				} else {
					SignUpDAO_v2 signUpDB = new SignUpDAO_v2();
					
					int check = signUpDB.insert(userId, userPassword, userName, 
							userGender, userEmail, userJob);
					
					if (check > 0) {
						JOptionPane.showMessageDialog(null, "회원가입 성공!", "회원가입 여부",
								JOptionPane.WARNING_MESSAGE);
						
						SignInW login = new SignInW();
						
						frame.dispose();
						login.setFrame();
						
					} else {
						JOptionPane.showMessageDialog(null, "회원가입 실패ㅠ", "회원가입 여부",
								JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SignInW logIn = new SignInW();
				frame.dispose();
				
				logIn.setFrame();
			}
		});
		
		for (int i=0; i<btn.length; i++) {
			bottomP.add(btn[i]);
		}
		frame.add(bottomP);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}
	
	public Frame getFrame() {
		return frame;
	}
}
