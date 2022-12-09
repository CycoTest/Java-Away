package ex08_AWT.Component.PopupMenu;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("PopupMenu Test");
		f.setSize(300, 200);
		
		PopupMenu pMenu = new PopupMenu("Edit");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		f.add(pMenu);
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
//				if (me.getModifiers() == me.BUTTON3_MASK) {
//					pMenu.show(f, me.getX(), me.getY());
//				}
//				9 버전 이후, 사용 중지 선언
				
				if (me.getModifiersEx() == InputEvent.BUTTON3_DOWN_MASK) {
					pMenu.show(f, me.getX(), me.getY());
				}
			}
		});
		f.setVisible(true);
	}
}
