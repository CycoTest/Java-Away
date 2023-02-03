package ex01_oracle.Insert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Oracle_Insert03 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##green";
		String password = "green1234";

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();

			String sql1 = "SELECT max(deptno) FROM dept";
			ResultSet rs = stmt.executeQuery(sql1);
			
			int maxDeptNo = 0;
			while (rs.next()) {
				maxDeptNo = rs.getInt("max(deptno)");
			}
//			System.out.println(maxDeptNo);
			
			int ideptno = maxDeptNo + 1;
			String sdname = "IT", sloc = "SEOUL";
			String sql2 = "INSERT INTO v_dept VALUES ('" + ideptno + "','" + sdname + "','" + sloc + "')";
			System.out.println(sql2);
			
			boolean b = stmt.execute(sql2);
			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}

//			String sql = "SELECT * FROM dept";
			String sql3 = "SELECT deptno, dname, loc FROM dept";
			ResultSet rs2 = stmt.executeQuery(sql3);
			while (rs2.next()) {
				System.out.print(rs2.getString("deptno") + "\t");
				System.out.print(rs2.getString("dname") + "\t");
				System.out.println(rs2.getString("loc") + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
