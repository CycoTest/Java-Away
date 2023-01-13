package component.signup.addon;

import java.awt.Component;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mommoo.flat.layout.linear.constraints.LinearConstraints;
import com.mommoo.flat.layout.linear.constraints.LinearSpace;

import component.signup.popUp.EmailCheck;
import database.openDB.MemberDTO;

public class SPanel2 {
	private JPanel p2;
	private JLabel[] lb;
	private JLabel mlb;
	private JTextField[] tf;
	private JTextField mtf1, mtf2;
	private JButton btn;
	private String genderChoice;
	private MemberDTO dto;

	public SPanel2() {
		p2 = new JPanel();

		lb = new JLabel[5];
		lb[0] = new JLabel("이름", Label.RIGHT);
		lb[1] = new JLabel("성별", Label.RIGHT);
		lb[2] = new JLabel("E-mail", Label.RIGHT);
		lb[3] = new JLabel("직업", Label.RIGHT);

		mlb = new JLabel("@");

		btn = new JButton("이메일 인증");

		tf = new JTextField[4];
		for (int i = 0; i < tf.length; i++) {
			tf[i] = new JTextField(15);
		}

		mtf1 = new JTextField(7);
		mtf2 = new JTextField(5);

		dto = new MemberDTO();
	}

	private void setName() {
		tf[0].setFocusTraversalKeysEnabled(false);
		tf[0].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_TAB) {
					tf[1].requestFocus();
				}
			}
		});
		
		tf[0].addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tf[0].getText().trim().equals("성")) {
					tf[0].setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (tf[0].getText().trim().length() == 0) {
					tf[0].setText("성");
				}
			}
		});

		tf[1].setFocusTraversalKeysEnabled(false);
		tf[1].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_TAB) {
					mtf1.requestFocus();
				}
			}
		});
		
		tf[1].addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tf[1].getText().trim().equals("이름")) {
					tf[1].setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (tf[1].getText().trim().length() == 0) {
					tf[1].setText("이름");
				}
			}
		});

		lb[0].setBounds(100, 15, 80, 30);
		lb[0].setFont(new Font("", Font.BOLD, 14));

		tf[0].setBounds(140, 20, 110, 23);
		tf[1].setBounds(270, 20, 110, 23);

		p2.add(lb[0]);
		p2.add(tf[0]);
		p2.add(tf[1]);
	}

	private void setGenderButton() {
		JButton male = new JButton("남자");
		male.setFont(new Font("", Font.BOLD, 14));
		male.setBounds(140, 55, 110, 23);

		JButton female = new JButton("여자");
		female.setFont(new Font("", Font.BOLD, 14));
		female.setBounds(270, 55, 110, 23);
		
		male.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				male.setSelected(true);
				female.setSelected(false);
				genderChoice = male.getText().trim();
			}
		});

		female.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				male.setSelected(false);
				female.setSelected(true);
				genderChoice = female.getText().trim();
			}
		});
		
		lb[1].setBounds(100, 50, 80, 30);
		lb[1].setFont(new Font("", Font.BOLD, 14));

		p2.add(lb[1]);
		p2.add(male);
		p2.add(female);
	}

	private void setEmail() {
		JComboBox<String> domain = new JComboBox<String>();
		domain.setModel(new DefaultComboBoxModel<String>(
				new String[] { "직접 입력", "gmail.com", "naver.com", "hanmail.net", "proton.me" }));

		mlb = new JLabel("@");
		mlb.setFont(new Font("", Font.BOLD, 14));

		mtf1.setFocusTraversalKeysEnabled(false);
		mtf1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src = (JTextField) ke.getSource();
				if (src.getText().length() >= 12) {
					ke.consume();
				}
			}
			
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_TAB) {
					mtf2.requestFocus();
				}
			}
		});

		mtf1.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (mtf1.getText().trim().equals("E-mail")) {
					mtf1.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (mtf1.getText().trim().length() == 0) {
					mtf1.setText("E-mail");
				}
			}
		});
		
		mtf2.setFocusTraversalKeysEnabled(false);
		mtf2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_TAB) {
					tf[2].requestFocus();
				}
			}
		});

		mtf2.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (mtf2.getText().trim().equals("직접 입력")) {
					mtf2.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (mtf2.getText().trim().length() == 0) {
					mtf2.setText("직접 입력");
				}
			}
		});

		domain.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectTail = domain.getSelectedItem().toString();
				mtf2.setText(selectTail);
			}
		});

		// 이메일 인증
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				EmailCheck verify = new EmailCheck();

				verify.setFrame(getEmailText());
			}
		});

		lb[2].setBounds(85, 90, 80, 30);
		lb[2].setFont(new Font("", Font.BOLD, 14));
		mtf1.setBounds(140, 95, 100, 23);
		mlb.setBounds(248, 93, 20, 23);
		mtf2.setBounds(270, 95, 110, 23);
		domain.setBounds(270, 125, 110, 23);
		btn.setBounds(140, 125, 110, 23);
		btn.setFont(new Font("", Font.BOLD, 14));

		p2.add(lb[2]);
		p2.add(mtf1);
		p2.add(mlb);
		p2.add(mtf2);
		p2.add(domain);
		p2.add(btn, new LinearConstraints().setLinearSpace(LinearSpace.MATCH_PARENT));
	}

	private void setJob() {
		JComboBox<String> jobList = new JComboBox<String>();
		jobList.setModel(new DefaultComboBoxModel<String>(
				new String[] { "직접 입력", "법조계", "의료계", "기타" }));

		tf[2].addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tf[2].getText().trim().equals("직업")) {
					tf[2].setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (tf[2].getText().trim().length() == 0) {
					tf[2].setText("직업");
				}
			}
		});

		jobList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectJob = jobList.getSelectedItem().toString();
				tf[2].setText(selectJob);
			}
		});

		lb[3].setBounds(100, 170, 80, 30);
		lb[3].setFont(new Font("", Font.BOLD, 14));

		tf[2].setBounds(140, 175, 110, 23);
		jobList.setBounds(270, 175, 110, 23);

		p2.add(lb[3]);
		p2.add(tf[2]);
		p2.add(jobList);
	}

	public Component setPanel2Component() {
		p2.setBounds(0, 210, 500, 240);
		p2.setLayout(null);

		setName();
		setGenderButton();
		setEmail();
		setJob();

		return p2;
	}

	public String getNameText() {
		String getName = tf[0].getText().trim() + tf[1].getText().trim();
		dto.setName(getName);
		return dto.getName();
	}

	public String getGednderText() {
		String getGender = genderChoice;
		dto.setSex(getGender);
		return dto.getSex();
	}

	public String getEmailText() {
		String sendMailAddress = mtf1.getText().trim() + mlb.getText().trim() + mtf2.getText().trim();
		dto.setEmail(sendMailAddress);
		return dto.getEmail();
	}

	public String getJobText() {
		String getJob = tf[2].getText().trim();
		dto.setJob(getJob);
		return dto.getJob();
	}

	public String setText(String text) {
		return text;
	}
}