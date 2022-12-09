package memo;

import java.awt.Menu;
import java.awt.MenuItem;

public class FormMenu {
	
	public Menu FormMenuSetting() {
		Menu mForm = new Menu("서식(O)");
		MenuItem miAutoSwitch = new MenuItem("자동 줄 바꿈(W)");
		MenuItem miFont = new MenuItem("글꼴(F)...");
		
		mForm.add(miAutoSwitch);
		mForm.add(miFont);
		
		return mForm;
	}
}
