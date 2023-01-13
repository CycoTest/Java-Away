package database.sign;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.openDB.DBconnect;

public class SignUpDAO_v2 {
	private PreparedStatement psmt;
	private int cnt;
	private ResultSet rs;
	private String id, pw;

	public int insert(String userId, String userPassword, String userName, String userGender, 
			String userEmail, String userJob) {

		DBconnect dao = new DBconnect();
		
		try {

			String sql = "insert into DrugSignUp values(?,?,?,?,?,?)";

			psmt = dao.conn().prepareStatement(sql);
			psmt.setString(1, userId);
			psmt.setString(2, userPassword);
			psmt.setString(3, userName);
			psmt.setString(4, userGender);
			psmt.setString(5, userEmail);
			psmt.setString(6, userJob);
			cnt = psmt.executeUpdate();
			
			psmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cnt;
	}
	
	public String findID(String userName, String userEmail) {
		DBconnect dao = new DBconnect();
		
		try {
			
			String sql = "select ID from DrugSignUp where name=? and email=?";
			
			psmt = dao.conn().prepareStatement(sql);
			psmt.setString(1, userName);
			psmt.setString(2, userEmail);
			
			rs = psmt.executeQuery();
			id = "";
			while (rs.next()) {
				id = rs.getString("id");
			}
			
			rs.close();
			psmt.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id;
	}
	
	public String findPW(String userId) {
		DBconnect dao = new DBconnect();
		
		try {
			
			String sql = "select PW from DrugSignUp where id=?";
			
			psmt = dao.conn().prepareStatement(sql);
			psmt.setString(1, userId);
			cnt = psmt.executeUpdate();
			
			rs = psmt.executeQuery();
			pw = "";
			while (rs.next()) {
				pw = rs.getString("pw");
			}
			
			rs.close();
			psmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pw;
	}
}
