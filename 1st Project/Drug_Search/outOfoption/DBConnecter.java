package outOfoption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
	
	public static Connection getConntection() {
		Connection connect = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String user = "c##green";
		String password = "green1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			
			Class.forName(driver);
			connect = DriverManager.getConnection(url, user, password);
		
		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 : " + cnfe.toString());
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			System.out.println("DB 접속 실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unknown Error");
			e.printStackTrace();
		}
		
		return connect;
	}
}
