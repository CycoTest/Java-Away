package ex01_Log.In;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import DAO.VO.SignUp_DAO;
import DAO.VO.SignUp_VO;

public class SignUp {
	private Frame mini;
	private Panel insertInfo;
	private Button put;
	private SignUp_DAO signUpDAO;
	private TextField signID, signPW;
	
	private Component miniSet() {
		insertInfo = new Panel();
		insertInfo.setLayout(new GridLayout(2,1));
		
		signID = new TextField(15);
		signPW = new TextField(25);
		Label idText = new Label("ID : ", Label.RIGHT);
		Label pwText = new Label("Password : ", Label.RIGHT);
		
		insertInfo.add(idText);
		insertInfo.add(signID);
		insertInfo.add(pwText);
		insertInfo.add(signPW);
		
		return insertInfo;
	}
	
	private Button putInfo() {
		put = new Button("pass");
		
		signUpDAO = new SignUp_DAO();
		put.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click!");
				ArrayList<SignUp_VO> list = signUpDAO.list(signID.getText(), signPW.getText());
				
				String id = null;
				String pw = null;
				for (int i=0; i<list.size(); i++) {
					SignUp_VO data = (SignUp_VO) list.get(i);
					id = data.getID();
					pw = data.getPW();
				}
				
				
			}
		});
		return put;
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startSignUp() {
		mini = new Frame("Sign-Up");
		mini.setSize(500, 100);
		mini.setLayout(new FlowLayout());
		mini.setLocationRelativeTo(null);
		mini.setResizable(false);
		
		mini.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				mini.dispose();
			}
		});
		
		mini.add(miniSet());
		mini.add(putInfo());
		
		mini.setVisible(true);
	}
}
