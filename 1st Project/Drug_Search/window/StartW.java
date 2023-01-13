package window;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class StartW extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private BufferedImage image = null;
	private JButton button = new JButton(new ImageIcon("D:\\KP_P\\Java\\Java Class\\image\\start.button.jpg"));
	
	public StartW() {
		setTitle("의약품 조회");
	
		button.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemberCheckW entrance = new MemberCheckW();
				setVisible(false);
				
				entrance.setFrame();
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		
		// 배경 Panel
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(640, 600);
		layeredPane.setLayout(null);
		
		try {
			image = ImageIO.read(new File("D:\\KP_P\\Java\\Java Class\\image\\start.window.pill.jpg"));
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		// 이미지 삽입
		myPanel panel = new myPanel();
		panel.setSize(640, 600);
		panel.setLayout(null);
		
		button.setSize(80, 100);
		button.setBorderPainted(false);
		button.setContentAreaFilled(true);
		button.setFocusPainted(false);
		button.setLocation(300, 100);
		panel.add(button);
		layeredPane.add(panel);
		
		add(layeredPane);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setBounds(720, 220, 640, 600);
		setVisible(true);
		setResizable(false);
	}
	
	class myPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		public void paint(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	public static void main(String[] args) {
		new StartW();
	}
}
