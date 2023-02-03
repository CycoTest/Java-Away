package memo;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoNotes extends WindowAdapter {
	
	public TextArea screenSetting() {
		TextArea screen = new TextArea(" ");
		return screen;
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startFrame() {
		String title = "*제목없음";
		Frame frame = new Frame(title + "- Windows 메모장");
		frame.setSize(500, 500);

		MenuBar mb = new MenuBar();
		FileMenu file = new FileMenu();
		EditMenu edit = new EditMenu();
		FormMenu form = new FormMenu();
		ViewMenu view = new ViewMenu();
		HelpMenu help = new HelpMenu();

		mb.add(file.FileFrameSetting());
		mb.add(edit.EditMenuSetting());
		mb.add(form.FormMenuSetting());
		mb.add(view.ViewMenuSetting());
		mb.setHelpMenu(help.HelpMenuSetting());

		
		frame.addWindowListener(this);
		
		frame.add(screenSetting());
		screenSetting().selectAll();
		frame.setMenuBar(mb);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		MemoNotes note = new MemoNotes();

		note.startFrame();
	}
}
