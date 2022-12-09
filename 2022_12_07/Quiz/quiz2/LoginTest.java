package quiz2;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class LoginTest {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(600, 150);
		f.setLayout(new FlowLayout());
		
		Label idText1 = new Label("ID : ", Label.RIGHT);
		Label pwdText1 = new Label("Password : ", Label.RIGHT);
		
		TextField id = new TextField(15);
		TextField pwd = new TextField(25);
		pwd.setEchoChar('*');
		
		Label idText2 = new Label("ID : ", Label.CENTER);
		Label pwdText2 = new Label("Password : ", Label.CENTER);
		
		f.add(idText1);
		f.add(id);
		f.add(pwdText1);
		f.add(pwd);
		f.setVisible(true);
	}
}
