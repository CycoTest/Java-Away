package ex01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListEx {
	
	public void print(ArrayList<Integer> list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayListEx ex = new ArrayListEx();
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		ArrayList<String> list2 = new ArrayList(list1.subList(1,4));
		ex.print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		ex.print(list1, list2);
		
		System.out.println("list1.containAll(list2):" + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		
		list2.add(3, "A");
		ex.print(list1, list2);
		
		list2.add(3, "AA");
		ex.print(list1, list2);
		
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		
		for (int i=list2.size()-1; i>=0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		ex.print(list1, list2);
	}
}

