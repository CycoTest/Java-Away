package memo;

import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.TextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileMenu {
	private Menu mFile;
	private MenuItem miNew;
	private MenuItem miNewWindow;
	private MenuItem miOpen;
	private MenuItem miSave;
	private MenuItem miSaveAs;
	private MenuItem miPageSetUp;
	private MenuItem miPrint;
	private MenuItem miExit;
	
	private void FileMenuSetting() {
		mFile = new Menu("파일(F)");
		miNew = new MenuItem("새로 만들기(N)");
		miNewWindow = new MenuItem("새 창(W)");
		miOpen = new MenuItem("열기(O)...");
		miSave = new MenuItem("저장(S)");
		miSaveAs = new MenuItem("다른 이름으로 저장(A)...");
		miPageSetUp = new MenuItem("페이지 설정(U)...");
		miPrint = new MenuItem("인쇄(P)...");
		miExit = new MenuItem("끝내기(X)");
	}

	public Menu FileFrameSetting() {
		FileMenuSetting();
		
		mFile.add(miNew);
		mFile.add(miNewWindow);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miSaveAs);
		mFile.addSeparator();
		mFile.add(miPageSetUp);
		mFile.add(miPrint);
		mFile.addSeparator();
		mFile.add(miExit);

		MemoNotes memo = new MemoNotes();
		
		miNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				memo.screenSetting().setText("");
			}
		});
		
		miNewWindow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		miOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		return mFile;
	}

}
