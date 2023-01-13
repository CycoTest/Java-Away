package database.sign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SignUpDAO_v1 {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	public ArrayList<SignUpVO> list(String userId, String userPassword, String userName, String userGender, String userEmail, String userJob) {
		ArrayList<SignUpVO> list = new ArrayList<SignUpVO>();
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
	
			String sql1 = "SELECT * FROM DrugSignUp";
			ResultSet rs = stmt.executeQuery(sql1);
			
			String id = userId;
			String pw = userPassword;
			String name = userName;
			String gender = userGender;
			String email = userEmail;
			String job = userJob;
			while (rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				gender = rs.getString("gender");
				email = rs.getString("email");
				job = rs.getString("job");
			}
			
			String sql2 = "INSERT INTO DrugSignUp VALUES ('" + id + "','" + pw + "','" + name + "','" + gender + "','" + email + "','" + job + "')";
			System.out.println(sql2);
			
			boolean b = stmt.execute(sql2);
			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}
	
			String sql3 = "SELECT id, password FROM amazom";
			ResultSet rs2 = stmt.executeQuery(sql3);
			while (rs2.next()) {
				System.out.print(rs2.getString("id") + "\t");
				System.out.println(rs2.getString("password") + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return list;
	}
}
