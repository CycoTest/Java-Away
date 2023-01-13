package database.openDB;

import java.sql.Timestamp;

public class MemberDTO {
	private String userId;
	private String userPassword;
	private String userPasswordCheck;
	private String userName;
	private String userSex;
	private String userEmail;
	private String userJob;
	
	private Timestamp enroll_date;
	private char quit_yn;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(String userId, String userPassword, String userName,
			String userSex, String userEmail, String userJob,
			Timestamp enroll_date, char quit_yn) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userSex = userSex;
		this.userEmail = userEmail;
		this.userJob = userJob;
		
		this.enroll_date = enroll_date;
		this.quit_yn = quit_yn;
	}
	
	public String getId() {
		return userId;
	}
	
	public void setId(String userId) {
		this.userId = userId;
	}
	
	public String getPW() {
		return userPassword;
	}
	
	public void setPW(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getPWCheck() {
		return userPasswordCheck;
	}
	
	public void setPWCheck(String userPasswordCheck) {
		this.userPasswordCheck = userPasswordCheck;
	}
	
	public String getName() {
		return userName;
	}
	
	public void setName(String userName) {
		this.userName = userName;
	}
	
	public String getSex() {
		return userSex;
	}
	
	public void setSex(String userSex) {
		this.userSex = userSex;
	}
	
	public String getEmail() {
		return userEmail;
	}
	
	public void setEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getJob() {
		return userJob;
	}
	
	public void setJob(String userJob) {
		this.userJob = userJob;
	}
	
	public Timestamp getEnroll_date() {
		return enroll_date;
	}
	
	public void setEnroll_date(Timestamp enroll_date) {
		this.enroll_date = enroll_date;
	}
	
	public char getQuit_yn() {
		return quit_yn;
	}
	
	public void setQuit_yn(char quit_yn) {
		this.quit_yn = quit_yn;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", userPassword=" + userPassword + 
				", userName=" + userName + ", userSex=" + userSex +
				", userEmail= " + userEmail + ", userJob=" + userJob + "]";
	}
}
