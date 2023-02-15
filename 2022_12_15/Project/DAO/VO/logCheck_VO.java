package DAO.VO;

public class logCheck_VO {
	private String id;
	private String pw;

	public logCheck_VO() {

	}

	public logCheck_VO(String iD, String password) {
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
