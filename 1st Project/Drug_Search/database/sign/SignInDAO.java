package database.sign;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.openDB.DBconnect;

public class SignInDAO {
	private PreparedStatement psmt;
	private int cnt;

	public int in(String userId, String userPassword) {
		DBconnect dao = new DBconnect();
		
		try {
			
			String sql = "select * from DrugSignUp where id=? and pw=?";
			
			psmt = dao.conn().prepareStatement(sql);
			psmt.setString(1, userId);
			psmt.setString(2, userPassword);
			cnt = psmt.executeUpdate();
			
			psmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
}
