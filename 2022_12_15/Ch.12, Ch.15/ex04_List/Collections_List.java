package ex04_List;

import java.util.ArrayList;
import java.util.List;

public class Collections_List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Serverlet/JSP");
		list.add(2, "Database");
		list.add("iBATTS");

		int size = list.size();
		System.out.println("총 객체수 : " + size);

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		list.remove(2);
		list.remove("iBATTS");
		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}
}
