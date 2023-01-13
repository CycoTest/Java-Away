package component.signup.addon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mommoo.flat.layout.linear.constraints.LinearConstraints;
import com.mommoo.flat.layout.linear.constraints.LinearSpace;

import database.openDB.DBconnect;
import database.openDB.MemberDTO;

public class SPanel1 {
	private JPanel p1;
	private JLabel[] lb;
	private JTextField tf;
	private JPasswordField ptf1, ptf2;
	private JButton btn;
	private String pw, pwc;
	private MemberDTO dto;

	public SPanel1() {
		p1 = new JPanel();

		lb = new JLabel[4];
		lb[0] = new JLabel("아이디", Label.RIGHT);
		lb[1] = new JLabel("비밀번호", Label.RIGHT);
		lb[2] = new JLabel("비밀번호 확인", Label.RIGHT);
		lb[3] = new JLabel("영문+특수문자+숫자 16자로 구성되어야 합니다", Label.RIGHT);

		for (int i = 0; i < lb.length - 1; i++) {
			lb[i].setFont(new Font("", Font.BOLD, 14));
		}
		lb[3].setFont(new Font("", Font.BOLD, 13));
		lb[3].setForeground(Color.red);

		tf = new JTextField(10);
		ptf1 = new JPasswordField("", 15);
		ptf2 = new JPasswordField("", 15);

		btn = new JButton("중복 확인");
		
		dto = new MemberDTO();
	}

	private void setId() {
		lb[0].setBounds(85, 45, 80, 30);
		tf.setBounds(140, 51, 120, 20);
		btn.setBounds(280, 50, 100, 23);
		btn.setFont(new Font("", Font.BOLD, 14));

		tf.setFocusTraversalKeysEnabled(false);
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_TAB) {
					btn.requestFocus();
				}
			}
		});
		tf.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tf.getText().trim().equals("아이디")) {
					tf.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (tf.getText().trim().length() == 0) {
					tf.setText("아이디");
				}
			}
		});

		btn.setFocusTraversalKeysEnabled(false);
		btn.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_TAB) {
					ptf1.requestFocus();
				}
			}
		});

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userId = tf.getText().trim();
				if (checkId(userId) == true) {
					JOptionPane.showMessageDialog(null, "이미 사용 중인 아이디입니다", "아이디 중복 체크", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "사용 가능한 아이디!", "아이디 중복 체크", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		p1.add(tf);
	}

	private boolean checkId(String userId) {
		DBconnect dao = new DBconnect();
		PreparedStatement psmt;
		int cnt = 0;

		dao.conn();
		try {
			String sql = "select id from DrugSignUp where id=?";

			psmt = dao.conn().prepareStatement(sql);
			psmt.setString(1, userId);
			cnt = psmt.executeUpdate();
			if (cnt > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	private void setPassword() {
		lb[1].setBounds(70, 85, 80, 30);
		lb[3].setBounds(110, 160, 400, 23);
		ptf1.setBounds(140, 91, 240, 20);
		ptf1.setEchoChar('●');

		ptf1.setFocusTraversalKeysEnabled(false);
		ptf1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src = (JTextField) ke.getSource();
				if (src.getText().length() > 15) {
					ke.consume();
				}
			}
			
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_TAB) {
					ptf2.requestFocus();
				}
				
				char pass[] = ptf1.getPassword();
				String pwText = String.valueOf(pass);
				pw = pwText;
			}
		});

		p1.add(ptf1);
	}

	private void setPasswordCheck() {
		lb[2].setBounds(40, 125, 100, 30);
		ptf2.setBounds(140, 131, 240, 20);
		ptf2.setEchoChar('●');

		ptf2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src = (JTextField) ke.getSource();
				if (src.getText().length() > 15) {
					ke.consume();
				}
			}
			
			public void keyPressed(KeyEvent ke) {
				if (ke.getSource() == ptf2) {
					String pwText = new String(ptf2.getPassword());
					pwc = String.valueOf(pwText);
				}
			}
		});

		p1.add(ptf2);
	}

	public Component setPanel1Component() {
		p1.setBounds(0, 10, 500, 200);
		p1.setLayout(null);

		setId();
		setPassword();
		setPasswordCheck();

		for (int i = 0; i < lb.length; i++) {
			p1.add(lb[i]);
		}

		p1.add(btn, new LinearConstraints().setLinearSpace(LinearSpace.MATCH_PARENT));

		return p1;
	}

	public String getIdText() {
		dto.setId(tf.getText());
		return dto.getId();
	}

	public String getPwText() {
		dto.setPW(pw.trim());
		System.out.println(pw.trim());
		return dto.getPW();
	}

	public String getPwCheckText() {
		dto.setPWCheck(pwc.trim());
		System.out.println(pwc.trim());
		return dto.getPWCheck();
	}

	public String setText(String text) {
		return text;
	}
}
