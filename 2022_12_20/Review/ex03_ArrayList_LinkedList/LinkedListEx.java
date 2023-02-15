package ex03_ArrayList_LinkedList;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(200000);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList :" + add1(al));
		System.out.println("LinknedList :" + add1(ll));
		System.out.println();
		
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList :" + add2(al));
		System.out.println("LinknedList :" + add2(ll));
		System.out.println();
		
		System.out.println("= 중간에 삭제하기 =");
		System.out.println("ArrayList :" + remove2(al));
		System.out.println("LinknedList :" + remove2(ll));
		System.out.println();
		
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList :" + remove1(al));
		System.out.println("LinknedList :" + remove1(ll));
		System.out.println();
	}
	
	public static long add1(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long add2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			list.add(500);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove1(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i =0; i<100000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}
