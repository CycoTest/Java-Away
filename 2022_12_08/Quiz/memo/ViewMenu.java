package memo;

import java.awt.CheckboxMenuItem;
import java.awt.Menu;
import java.awt.MenuItem;

public class ViewMenu {
	
	public Menu ViewMenuSetting() {
		Menu mView = new Menu("보기(V)");
		Menu mZoom = new Menu("확대하기/축소하기");
		MenuItem miZoomIn = new MenuItem("확대(I)");
		MenuItem miZoomOut = new MenuItem("축소(O)");
		MenuItem miZoomDefault = new MenuItem("확대하기/축소하기 기본값 복원");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		
		mView.add(mZoom);
		mZoom.add(miZoomIn);
		mZoom.add(miZoomOut);
		mZoom.add(miZoomDefault);
		mView.add(miStatusbar);
		
		return mView;
	}
}
