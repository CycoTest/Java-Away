package component.signup.addon;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import outOfoption.SPanel3;

public class SignUpCheck extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private String matchID;
	private String matchPW;
	private String matchPWcheck;
	private String matchName;
	private String matchEmail;
	private String matchJob;
//	private String matchPhoneNum;
	private String matchCheatBlock;
	
	private boolean membershipProgress;
	
	public SignUpCheck(Frame frame) {
		super(frame, true);
		
		SPanel1 p1 = new SPanel1();
		SPanel2 p2 = new SPanel2();
		SPanel3 p3 = new SPanel3();
		
		matchID = p1.getIdText();
		matchPW = p1.getPwText();
		matchName = p2.getNameText();
		matchEmail = p2.getEmailText();
		matchJob = p2.getJobText();
//		matchPhoneNum = p2.getPhoneNumText().trim();
		matchCheatBlock = p3.getCheatBlockText();
		
		membershipProgress = false;

		checkValue();
	}
	
	public void checkValue() {
		if (matchID.length()==0 || matchID.equals("아이디")) {
			JOptionPane.showMessageDialog(null, "아이디를 입력하세요.", "아이디 입력", 
					JOptionPane.WARNING_MESSAGE);
			
			dispose();
		}
		
		if (matchPW == null || matchPW.equals("비밀번호")) {
			JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.", "비밀번호 입력", 
					JOptionPane.WARNING_MESSAGE);
			
			dispose();
		}
		
		if (matchPWcheck == null || matchPWcheck.equals("비밀번호 확인")) {
			JOptionPane.showMessageDialog(null, "비밀번호 확인을 입력하세요.", "비밀번호 확인 입력", 
					JOptionPane.WARNING_MESSAGE);
			
			dispose();
		}
		
		if (matchName == null || matchName.equals("이름")) {
			JOptionPane.showMessageDialog(null, "이름을 입력하세요.", "이릅 입력", 
					JOptionPane.WARNING_MESSAGE);
			
			dispose();
		}
		
		if (matchEmail == null || matchEmail.equals("E-mail")) {
			JOptionPane.showMessageDialog(null, "이메일 주소를 입력하세요.", "이메일 입력", 
					JOptionPane.WARNING_MESSAGE);
			
			dispose();
		}
		
		if (matchJob == null || matchJob.equals("직업")) {
			JOptionPane.showMessageDialog(null, "직업을 입력하세요.", "직업 입력", 
					JOptionPane.WARNING_MESSAGE);
			
			dispose();
		}
		
//		if (matchPhoneNum.length()==0 || matchPhoneNum.equals("휴대폰 번호")) {
//			JOptionPane.showMessageDialog(null, "휴대폰 번호를 입력하세요.", "휴대폰 번호 입력", 
//					JOptionPane.WARNING_MESSAGE);
//			
//			dispose();
//		}
		
		if(matchCheatBlock == null || matchCheatBlock.equals("자동 등록 방지")) {
			JOptionPane.showMessageDialog(null, "자동 등록 방지 코드를 입력하세요.", "자동 등록 방지 입력", 
					JOptionPane.WARNING_MESSAGE);
			
			dispose();
		}
		
		membershipProgress = true;
		
		
//		setVisible(false);
//		dispose();
	}
	
	public boolean memberCheck() {
		return membershipProgress;
	}
	
	public String getIdText() {
		return matchID;
	}
	
	public String getPWText() {
		return matchPW;
	}
	
	public String getPWcheckText() {
		return matchPWcheck;
	}
	
	public String getNameText() {
		return matchName;
	}
	
	public String getEmailText() {
		return matchEmail;
	}
	
	public String getJobText() {
		return matchJob;
	}
	
//	public String getPhoneNumText() {
//		return matchPhoneNum;
//	}
	
	public String getCheatBlockText() {
		return matchCheatBlock;
	}
}
