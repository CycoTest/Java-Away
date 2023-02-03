package ex03_DAO.VO;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberTest {
	public static void main(String[] args) {
		System.out.print("Input ename...? ");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		
		System.out.println(input);
		in.close();
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVo> list = dao.list(input);
//		ArrayList<type>

		for (int i = 0; i < list.size(); i++) {
			MemberVo data = (MemberVo) list.get(i);
			String empno = data.getEmpno();
			String ename = data.getEname();
			int sal = data.getSal();

			System.out.println(empno + " : " + ename + " : " + sal);
		}
	}
}
