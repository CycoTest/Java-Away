package database.openDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconnect {
	private Connection connect = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	int cnt = 0;

	public Connection conn() {
		try {
			Class.forName(driver);
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "c##green";
			String db_password = "green1234";

			connect = DriverManager.getConnection(db_url, db_user, db_password);

			System.out.println("Connect Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connect;
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (connect != null) {
				connect.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
