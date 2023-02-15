package ex01_orderly.add;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList_Test {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();

		add(al);
		add(ll);

		System.out.println("= 접근시간 테스트 =");
		System.out.println("ArrayList :" + access(al));
		System.out.println("LinkedList :" + access(ll));
	}

	public static void add(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
	}

	public static long access(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}
