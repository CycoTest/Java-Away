package com.mommoo.flat.button;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import com.mommoo.flat.border.FlatShadowBorder;
import com.mommoo.flat.button.ripple.RippleEffect;
import com.mommoo.flat.component.OnClickListener;
import com.mommoo.flat.frame.FlatFrame;
import com.mommoo.util.ScreenManager;

public class FlatButton extends JButton implements ButtonViewModel{
	private static final int BUTTON_TEXT_FONT_SIZE = ScreenManager.getInstance().dip2px(11);
	private static final Cursor HAND_CURSOR = new Cursor(Cursor.HAND_CURSOR);

	private final RippleEffect RIPPLE_EFFECT = new RippleEffect();
	private final FlatButtonViewModel buttonViewModel = new FlatButtonViewModel(this, RIPPLE_EFFECT);

	private final List<ActionListener> ACTION_LISTENER_LIST = new ArrayList<>();
	private OnClickListener onClickListener = e -> {};
	private int cornerRound = 0;
	private boolean autoClick;

	public FlatButton(){
		setAlignmentCentered();
		setTextDecoration();
		setOpaque(true);
		setBackground(Color.PINK);
		setCursor(HAND_CURSOR);
		addRippleAnimMouseListener();
		removeBasicButtonGraphics();
	}

	public FlatButton(String text){
		this();
		setText(text);
	}

	public static void main(String[] args){
		FlatButton flatButton = new FlatButton("TEST");
		flatButton.setOnClickListener(comp-> System.out.println("onClick"));
		flatButton.addActionListener(e -> System.out.println("onAction"));
		flatButton.setPreferredSize(new Dimension(100,100));
//		flatButton.getRippleEffect().setRippleDrawOverBorder(true);
//		flatButton.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));

//		flatButton.doClick();

		FlatFrame flatFrame = new FlatFrame();
		flatFrame.setTitle("FlatButton test");
		flatFrame.setSize(500,500);
		flatFrame.getContainer().setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		flatFrame.getContainer().setLayout(new FlowLayout());
		flatFrame.getContainer().add(flatButton);

		flatFrame.setLocationOnScreenCenter();
		flatFrame.setResizable(true);
		flatFrame.show();
	}

	private void setAlignmentCentered(){
		setHorizontalAlignment(JButton.CENTER);
		setVerticalAlignment(JButton.CENTER);
	}

	private void setTextDecoration(){
		setFont(getFont().deriveFont(Font.BOLD, BUTTON_TEXT_FONT_SIZE));
		setForeground(Color.WHITE);
	}

	private void removeBasicButtonGraphics(){
		setContentAreaFilled(false);
		setFocusPainted(false);
		setBorderPainted(false);
		setBorder(BorderFactory.createEmptyBorder());
		getRippleEffect().setRippleDrawOverBorder(false);
	}

	private void addRippleAnimMouseListener(){
		MouseAdapter rippleAnimMouseListener = buttonViewModel.getRippleAnimMouseListener();
		addMouseListener(rippleAnimMouseListener);
		addMouseMotionListener(rippleAnimMouseListener);
	}

	public OnClickListener getOnClickListener(){
		return onClickListener;
	}

	public void setOnClickListener(OnClickListener onClickListener){
		buttonViewModel.getButtonEventRepository().removeEvent(this.onClickListener);
		buttonViewModel.getButtonEventRepository().addEvent(this.onClickListener, event -> onClickListener.onClick(this));
		this.onClickListener = onClickListener;
	}

	@Override
	public void addActionListener(ActionListener actionListener) {
		buttonViewModel.getButtonEventRepository().addEvent(actionListener, actionListener::actionPerformed);
		ACTION_LISTENER_LIST.add(actionListener);
	}

	@Override
	public void removeActionListener(ActionListener actionListener) {
		buttonViewModel.getButtonEventRepository().removeEvent(actionListener);
		ACTION_LISTENER_LIST.remove(actionListener);
	}

	@Override
	public ActionListener[] getActionListeners() {
		return ACTION_LISTENER_LIST.toArray(new ActionListener[ACTION_LISTENER_LIST.size()]);
	}

	@Override
	public boolean isContentAreaFilled() {
		return false;
	}

	@Override
	public boolean isBorderPainted() {
		return true;
	}
	
	@Override
	public boolean isFocusPainted() {
		return false;
	}

	@Override
	public void paint(Graphics g){
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		getBorder().paintBorder(this, g,0,0, getWidth(), getHeight());
		inspectAutoClick();
		paintBackground(g);
		super.paint(g);
		paintRipple(g);
	}

	@Override
	protected void paintBorder(Graphics g) {

	}

	private void paintBackground(Graphics g){
		g.setColor(getBackground());

		if (getBorder() instanceof FlatShadowBorder){
			Insets insets = getBorder().getBorderInsets(this);
			g.setClip(insets.left, insets.top, getWidth() - insets.left - insets.right , getHeight() - insets.top - insets.bottom);
		}

		g.fillRoundRect(0,0,getWidth(),getHeight(), cornerRound, cornerRound);
		g.setClip(null);
	}

	private void inspectAutoClick(){
		if (autoClick){
			buttonViewModel.executeRippleEffect(new Point(getWidth()/2, getHeight()/2), new ActionEvent(this, ActionEvent.ACTION_FIRST, "AUTO_CLICK"));
			autoClick = false;
		}
	}

	private void paintRipple(Graphics g){
		Rectangle clipRect = new Rectangle();

		if (getRippleEffect().isRippleDrawOverBorder()){
			clipRect.setBounds(0,0,getWidth(),getHeight());
		} else {
			Insets borderInsets = getBorder().getBorderInsets(this);
			clipRect.setBounds(borderInsets.left,
					borderInsets.top,
					getWidth() - borderInsets.left - borderInsets.right,
					getHeight() - borderInsets.top - borderInsets.bottom);
		}
		g.setClip(clipRect);
		buttonViewModel.paintRippleEffect((Graphics2D)g);

		g.setClip(null);
	}

	public int getCornerRound(){
		return this.cornerRound;
	}

	public void setCornerRound(int cornerRound){
		this.cornerRound = cornerRound;
	}

	public void doClick(){
		autoClick = true;
		repaint();
	}

	public RippleEffect getRippleEffect(){
		return RIPPLE_EFFECT;
	}
}
