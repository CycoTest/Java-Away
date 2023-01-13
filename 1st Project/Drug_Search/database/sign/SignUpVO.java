package database.sign;

public class SignUpVO {
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String email;
	private String job;

	public SignUpVO() {

	}

	public SignUpVO(String userId, String userPassword, String userName, 
			String userGender, String userEmail, String userJob) {
		id = userId;
		pw = userPassword;
		name = userName;
		gender = userGender;
		email = userEmail;
		job = userJob;
	}

	public String getID() {
		return id;
	}

	public String getPW() {
		return pw;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getJob() {
		return job;
	}
}
