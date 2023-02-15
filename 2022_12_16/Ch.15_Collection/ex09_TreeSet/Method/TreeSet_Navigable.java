package ex09_TreeSet.Method;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_Navigable {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();

		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(Integer.valueOf(95));
		scores.add(Integer.valueOf(80));

		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.println(score + " ");
		}
		System.out.println();

		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for (Integer score : ascendingSet) {
			System.out.println(score + " ");
		}
	}
}
