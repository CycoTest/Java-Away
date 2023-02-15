package ex01_Log.In;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import DAO.VO.logCheck_DAO;
import DAO.VO.logCheck_VO;

public class logInfo {
	private Panel centerUpPanel;
	private Panel centerDownPanel;
	private Panel bottomText;
	private logCheck_DAO dao;
	private TextField idF, pwF;
	
	public Component panelUpSetting() {
		centerUpPanel = new Panel();
		centerUpPanel.setLayout(new FlowLayout());
		
		idF = new TextField(15);
		pwF = new TextField(25);
		Label idText = new Label("ID : ", Label.RIGHT);
		Label pwText = new Label("Password : ", Label.RIGHT);
		
		centerUpPanel.add(idText);
		centerUpPanel.add(idF);
		centerUpPanel.add(pwText);
		centerUpPanel.add(pwF);
		
		pwF.setEchoChar('*');
		
		return centerUpPanel;
	}
	
	public Component panelDownSetting() {
		centerDownPanel = new Panel();
		centerDownPanel.setLayout(new FlowLayout());
		
		Button button1 = new Button("Sign-Up");
		Button button2 = new Button("Sign-In");
		
		centerDownPanel.add(button1);
		centerDownPanel.add(button2);
		
		SignUp newLog = new SignUp();
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newLog.startSignUp();
			}
		});
		
		dao = new logCheck_DAO();
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click!");
				ArrayList<logCheck_VO> list = dao.list(idF.getText(), pwF.getText());
				
				String id = "";
				String pw = "";
				for (int i=0; i<list.size(); i++) {
					logCheck_VO data = (logCheck_VO) list.get(i);
					id = data.getID();
					pw = data.getPW();
				}
				
				PopUp result = new PopUp();
				if (idF.getText() != "" && pwF.getText() != "") {
					if (idF.getText().equals(id) && pwF.getText().equals(pw)) {
						result.popSuccess();
					} else {
						result.popFail();
					}
				}
			}
		});
		
		return centerDownPanel;
	}
	
	public Component bottomText() {
		bottomText = new Panel();

		TextField text = new TextField(70);
		bottomText.add(text);
		
		return bottomText;
	}
}
