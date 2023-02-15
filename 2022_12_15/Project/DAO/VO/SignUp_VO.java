package DAO.VO;

public class SignUp_VO {
	private String id;
	private String pw;

	public SignUp_VO() {

	}

	public SignUp_VO(String iD, String password) {
		this.id = iD;
		this.pw = password;
	}

	public String getID() {
		return id;
	}

	public String getPW() {
		return pw;
	}
}
