package window;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import component.button.addon.RoundedButtonV1;
import test.search.SearchW;

public class MemberCheckW {
	private Frame frame;
	private RoundedButtonV1 btn1, btn2, btn3;
	BufferedImage image = null;

	public MemberCheckW() {
		frame = new Frame("회원 확인");
		btn1 = new RoundedButtonV1(" 회원 입장");
		btn2 = new RoundedButtonV1("비회원 입장");
		btn3 = new RoundedButtonV1("  종료");

		// 회원입장
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SignInW membership = new SignInW();
				frame.setVisible(false);

				membership.setFrame();
			}
		});

		// 비회원 입장
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SearchW look = new SearchW();
				frame.setVisible(false);

				look.setFrame();
			}
		});

		// 종료
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
	}

	public void setFrame() {
		frame.setSize(600, 520);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);

		// background image
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(600, 500);
		layeredPane.setLayout(null);
		layeredPane.setBounds(0, 20, 600, 500);

		try {
			image = ImageIO.read(new File("D:\\KP_P\\Java\\Java Class\\image\\memberCheck.png"));
		} catch (IOException e) {
			e.getStackTrace();
		}

		// image insert
		myPanel panel = new myPanel();
		panel.setSize(600, 500);
		panel.setLayout(null);

		btn1.setBounds(100, 200, 85, 30);
		btn2.setBounds(400, 200, 98, 30);
		btn3.setBounds(260, 400, 50, 30);
		
		layeredPane.add(panel);
		layeredPane.add(btn1);
		layeredPane.add(btn2);
		layeredPane.add(btn3);
		
		frame.add(layeredPane);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		frame.setVisible(true);
	}

	class myPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}
	}
}
