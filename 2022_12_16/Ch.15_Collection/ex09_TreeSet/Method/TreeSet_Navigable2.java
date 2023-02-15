package ex09_TreeSet.Method;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_Navigable2 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("[c-f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}
}
