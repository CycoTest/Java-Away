package DAO.VO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SignUp_DAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	public ArrayList<SignUp_VO> list(String iD, String passWord) {
		ArrayList<SignUp_VO> list = new ArrayList<SignUp_VO>();
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
	
			String sql1 = "SELECT * FROM amazom";
			ResultSet rs = stmt.executeQuery(sql1);
			
			String id = iD;
			String pw = passWord;
			while (rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("password");
			}
			
			String sql2 = "INSERT INTO amazom VALUES ('" + id + "','" + pw + "')";
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
