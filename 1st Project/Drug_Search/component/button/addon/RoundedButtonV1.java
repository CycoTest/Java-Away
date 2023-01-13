package component.button.addon;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class RoundedButtonV1 extends JButton {
	private static final long serialVersionUID = 1L;

	public RoundedButtonV1() {
		super();
		decorate();
	}

	public RoundedButtonV1(String text) {
		super(text);
		decorate();
	}

	public RoundedButtonV1(Action action) {
		super(action);
		decorate();
	}

	public RoundedButtonV1(Icon icon) {
		super(icon);
		decorate();
	}

	public RoundedButtonV1(String text, Icon icon) {
		super(text, icon);
		decorate();
	}

	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Color buttonB = new Color(255, 153, 204); // 배경색 결정
		Color fontC = new Color(051, 000, 000); // 글자색 결정
		Font fontH = new Font(getText(), Font.BOLD, 15);
		
		int width = getWidth();
		int height = getHeight();
		
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		if (getModel().isArmed()) {
			graphics.setColor(buttonB.darker());
		} else if (getModel().isRollover()) {
			graphics.setColor(buttonB.brighter());
		} else {
			graphics.setColor(buttonB);
		}
		
		graphics.fillRoundRect(0, 0, width, height, 50, 50);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
		
		int textX = (width - stringBounds.width) / 2 - 8;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent() + 2;
		
		graphics.setColor(fontC);
		graphics.setFont(fontH);
		graphics.drawString(getText(), textX, textY);
		graphics.dispose();
		super.paintComponent(g);
	}
}
