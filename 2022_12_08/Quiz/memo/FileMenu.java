package memo;

import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.TextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileMenu {
	
	public Menu FileMenuSetting() {
		Menu mFile = new Menu("파일(F)");
		MenuItem miNew = new MenuItem("새로 만들기(N)");
		MenuItem miNewWindow = new MenuItem("새 창(W)");
		MenuItem miOpen = new MenuItem("열기(O)...");
		MenuItem miSave = new MenuItem("저장(S)");
		MenuItem miSaveAs = new MenuItem("다른 이름으로 저장(A)...");
		
		MenuItem miPageSetUp = new MenuItem("페이지 설정(U)...");
		MenuItem miPrint = new MenuItem("인쇄(P)...");

		MenuItem mieXit = new MenuItem("끝내기(X)");

		mFile.add(miNew);
		mFile.add(miNewWindow);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miSaveAs);
		mFile.addSeparator();
		mFile.add(miPageSetUp);
		mFile.add(miPrint);
		mFile.addSeparator();
		mFile.add(mieXit);

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
		
		
		return mFile;
	}

	protected TextComponent screenSetting() {
		// TODO Auto-generated method stub
		return null;
	}
}
