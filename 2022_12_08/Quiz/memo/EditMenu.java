package memo;

import java.awt.Menu;
import java.awt.MenuItem;

public class EditMenu {

	public Menu EditMenuSetting() {
		Menu mEdit = new Menu("편집(E)");
		MenuItem miProcessShutDown = new MenuItem("실행 취소(U)          Ctrl+Z");

		MenuItem miCut = new MenuItem("잘라내기(T)           Ctrl+X");
		MenuItem miCopy = new MenuItem("복사(C)              Ctrl+C");
		MenuItem miPaste = new MenuItem("붙여넣기(P)           Ctrl+V");
		MenuItem miDelete = new MenuItem("삭제(L)                 Del");

		MenuItem miSearch = new MenuItem("Bing으로 검색(S)...   Ctrl+E");
		MenuItem miFind = new MenuItem("찾기(F)              Ctrl+F");
		MenuItem miNextFind = new MenuItem("다음 찾기(N)              F3");
		MenuItem miPreviewFind = new MenuItem("이전 찾기(V)        Shift+F3");
		MenuItem miAlter = new MenuItem("바꾸기(R)             Crtl+H");
		MenuItem miGo = new MenuItem("이동(G)              Crtl+G");

		MenuItem miAllSelect = new MenuItem("모두 선택(A)          Ctrl+A");
		MenuItem miTimeDate = new MenuItem("시간/날짜(D)              F5");

		mEdit.add(miProcessShutDown);
		mEdit.addSeparator();
		mEdit.add(miCut);
		mEdit.add(miCopy);
		mEdit.add(miPaste);
		mEdit.add(miDelete);
		mEdit.addSeparator();
		mEdit.add(miSearch);
		mEdit.add(miFind);
		mEdit.add(miNextFind);
		mEdit.add(miPreviewFind);
		mEdit.add(miAlter);
		mEdit.add(miGo);
		mEdit.addSeparator();
		mEdit.add(miAllSelect);
		mEdit.add(miTimeDate);
		
		return mEdit;
	}
}
