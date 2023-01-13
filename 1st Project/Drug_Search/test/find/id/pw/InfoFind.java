package test.find.id.pw;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import component.button.addon.RoundedButtonV3;
import component.button.addon.RoundedButtonV4;
import database.sign.SignUpDAO_v2;
import window.SignInW;

public class InfoFind {
	private Frame frame;
	private JPanel panelBundle, p1, p2;
	private JLabel lb[];
	private JTextField tf[];
	private RoundedButtonV3 hBtn[];
	private RoundedButtonV4 pBtn[];
	private CardLayout card;
	
	public InfoFind() {
		frame = new Frame("아이디/비밀번호 찾기");
		
		panelBundle = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		panelBundle.add(p1);
		panelBundle.add(p2);
		
		hBtn = new RoundedButtonV3[3];
		hBtn[0] = new RoundedButtonV3("아이디 찾기");
		hBtn[1] = new RoundedButtonV3("비밀번호 찾기");
		hBtn[2] = new RoundedButtonV3("돌아가기");
		
		pBtn = new RoundedButtonV4[4];
		for (int i=0; i<pBtn.length; i++) {
			pBtn[i] = new RoundedButtonV4();
			pBtn[i].setFont(new Font("", Font.BOLD, 14));
		}
		
		lb = new JLabel[4];
		for (int i=0; i<lb.length; i++) {
			lb[i] = new JLabel("", Label.RIGHT);
			lb[i].setFont(new Font("", Font.BOLD, 16));
		}
		
		tf = new JTextField[4];
		for (int i=0; i<tf.length; i++) {
			tf[i] = new JTextField();
			tf[i].setFont(new Font("", Font.BOLD, 16));
		}
		
		card = new CardLayout(0, 0);
	}
	
	private Component setPanelBundle() {
		panelBundle.setLayout(null);
		
		hBtn[0].setBounds(30, 30, 400, 60);
		hBtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(frame, "a2");
			}
		});

		hBtn[1].setBounds(30, 120, 400, 60);
		hBtn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(frame, "a3");
			}
		});
		
		hBtn[2].setBounds(30, 210, 400, 60);
		hBtn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SignInW login = new SignInW();
				
				login.setFrame();
				frame.dispose();
			}
		});
		
		for (int i=0; i<hBtn.length; i++) {
			panelBundle.add(hBtn[i]);
		}
		
		return panelBundle;
	}

	private Component setPanel1() {
		p1.setLayout(null);
		
		lb[0].setText("이름");
		lb[0].setBounds(80, 33, 50, 30);
		tf[0].setColumns(10);
		tf[0].setBounds(120, 35, 265, 30);
		
		lb[1].setText("E-mail");
		lb[1].setBounds(65, 110, 50, 30);
		tf[1].setColumns(10);
		tf[1].setBounds(120, 110, 120, 30);
		lb[2].setText("@");
		lb[2].setBounds(244, 105, 30, 30);
		tf[2].setColumns(10);
		tf[2].setBounds(265, 110, 120, 30);
		
		JComboBox<String> domain = new JComboBox<String>();
		domain.setModel(new DefaultComboBoxModel<String>(new String[] {"직접 입력", "gamil.com", "naver.com", "hanmail.net", "proton.me"}));
		
		domain.setBounds(265, 160, 120, 30);
		
		pBtn[0].setText("찾기");
		pBtn[0].setBounds(120, 160, 120, 50);
		
		pBtn[1].setText("돌아가기  ");
		pBtn[1].setBounds(120, 220, 120, 50);
		
		tf[0].setFocusTraversalKeysEnabled(false);
		tf[0].addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_TAB) {
					tf[1].requestFocus();
				}
			}
		});
		
		tf[1].setFocusTraversalKeysEnabled(false);
		tf[1].addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src = (JTextField) ke.getSource();
				if(src.getText().length() >= 12) {
					ke.consume();
				}
			}
			
			public void keyPressed(KeyEvent ke) {
				if(ke.getKeyCode() == KeyEvent.VK_TAB) {
					tf[2].requestFocus();
				}
			}
		});

		tf[2].setFocusTraversalKeysEnabled(false);
		tf[2].addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src = (JTextField) ke.getSource();
				if(src.getText().length() >= 12) {
					ke.consume();
				}
			}
			
			public void keyPressed(KeyEvent ke) {
				if(ke.getKeyCode() == KeyEvent.VK_TAB) {
					tf[0].requestFocus();
				}
			}
		});
		
		domain.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectTail = domain.getSelectedItem().toString();
				tf[2].setText(selectTail);
			}
		});
		
		pBtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userName = tf[0].getText().trim();
				String userEmail = tf[1].getText().trim() + lb[2].getText().trim() + tf[2].getText().trim();
				
				SignUpDAO_v2 find = new SignUpDAO_v2();
				SignInW login = new SignInW();
				
				String id = find.findID(userName, userEmail).trim();
				System.out.println(id);
				
				if (id.length() != 0) {
					JOptionPane.showMessageDialog(null, "아이디는 " + id, "아이디 찾기",
							JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					login.setFrame();
				} else {
					JOptionPane.showInternalMessageDialog(null, "잘못된 정보입니다", "아이디 찾기",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		pBtn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(frame, "a1");
			}
		});
		
		for (int i=0; i<lb.length; i++) {
			p1.add(lb[i]);
			p1.add(tf[i]);
		}
		
		for (int i=0; i<pBtn.length; i++) {
			p1.add(pBtn[i]);
		}

		p1.add(domain);
		
		return p1;
	}
	
	private Component setPanel2() {
		p2.setLayout(null);
		
		lb[3].setText("아아디");
		lb[3].setBounds(65, 50, 80, 23);
		
		tf[3].setColumns(10);
		tf[3].setBounds(140, 53, 200, 23);
		
		pBtn[2].setText("찾기");
		pBtn[2].setBounds(140, 100, 60, 30);
		
		pBtn[3].setText("돌아가기  ");
		pBtn[3].setBounds(240, 100, 100, 30);
		
		pBtn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userId = tf[3].getText().trim();
				
				SignUpDAO_v2 find = new SignUpDAO_v2();
				SignInW login = new SignInW();
				
				String pw = find.findPW(userId).trim();
				System.out.println(pw);
				
				if (pw.length() != 0) {
					JOptionPane.showMessageDialog(null, "비밀번호는 " + pw, "아이디 찾기",
							JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					login.setFrame();
				} else {
					JOptionPane.showInternalMessageDialog(null, "잘못된 정보입니다", "아이디 찾기",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		pBtn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(frame, "a1");
			}
		});
		
		p2.add(pBtn[2]);
		p2.add(pBtn[3]);
		p2.add(tf[3]);
		p2.add(lb[3]);
		
		return p2;
	}
	
	public void setFrame() {
		frame.setSize(500, 330);
		frame.setLayout(card);
		frame.setLocationRelativeTo(null);
		
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		frame.add("a1", setPanelBundle());
		frame.add("a2", setPanel1());
		frame.add("a3", setPanel2());

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		InfoFind testCard = new InfoFind();
		
		testCard.setFrame();
	}
}
