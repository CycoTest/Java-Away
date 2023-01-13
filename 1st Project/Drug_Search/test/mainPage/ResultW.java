package test.mainPage;

import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import component.button.addon.RoundedButtonV2;

public class ResultW {
	private JFrame frame;
	private JLabel nlb[]; // nomal label
	private JLabel rlb1, blb1, blb2; 
	private RoundedButtonV2[] rbn;
	
	public ResultW() {
		frame = new JFrame("검색 결과");
	
		nlb = new JLabel[8];
		nlb[0] = new JLabel("약품명:", Label.RIGHT);
		nlb[1] = new JLabel("성분/함량", Label.RIGHT);
		nlb[2] = new JLabel("회사명", Label.RIGHT);
		nlb[3] = new JLabel("제형", Label.RIGHT);
		nlb[4] = new JLabel("효능", Label.RIGHT);
		nlb[5] = new JLabel("구분", Label.RIGHT);
		nlb[6] = new JLabel("공급 유무", Label.RIGHT);
		nlb[7] = new JLabel("부작용", Label.RIGHT);
		
		rbn = new RoundedButtonV2[5];
		rbn[0] = new RoundedButtonV2("회사명");
		rbn[1] = new RoundedButtonV2("부작용 조회");
		rbn[2] = new RoundedButtonV2("대체약 조회");
		rbn[3] = new RoundedButtonV2("조회");  // 마약 여부
		rbn[4] = new RoundedButtonV2("거래 정황");
	}
	
	private void drugImage() {
		
	}
	
	private void drugIngredient() {
		
	}
	
	private void drugMaker() {
		
	}
	
	private void drugFormulation() {
		
	}
	
	private void drugEffect() {
		
	}
	
	private void drugClassify() {
		
	}
	
	private void drugProvide() {
		
	}
	
	public void setFrame() {
		frame.setSize(900, 900);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		drugImage();
		drugIngredient();
		drugMaker();
		drugFormulation();
		drugEffect();
		drugClassify();
		drugProvide();
		
		frame.setVisible(true);
	}
	
}
