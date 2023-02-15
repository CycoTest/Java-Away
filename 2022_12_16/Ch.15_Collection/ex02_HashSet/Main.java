package ex02_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servle/JSP");
		set.add("Java");
		set.add("iBATTS");

		int size = set.size();
		System.out.println("총 객체 수 : " + size);

		Iterator<String> iterator = set.iterator();
//		iterator: 데이터 순회 탐색용 메소드
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.remove("JDBC");
		set.remove("iBATTS");

		System.out.println("총 객체 수 : " + set.size());

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
