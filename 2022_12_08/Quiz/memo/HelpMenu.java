package memo;

import java.awt.Menu;
import java.awt.MenuItem;

public class HelpMenu {
	
	public Menu HelpMenuSetting() {
		Menu mHelp = new Menu("도움말(H)");
		MenuItem miHelp = new MenuItem("도움말 보기(H)");
		MenuItem miFeedback = new MenuItem("피드백 보내기(F)");
		MenuItem miDialog = new MenuItem("메모장 정보(A)");
		
		mHelp.add(miHelp);
		mHelp.add(miFeedback);
		mHelp.addSeparator();
		mHelp.add(miDialog);
		
		return mHelp;
	}
}
