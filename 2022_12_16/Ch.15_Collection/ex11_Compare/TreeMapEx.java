package ex11_Compare;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();

		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));

		Iterator<Person> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
		System.out.println();
		
		Iterator<Person> descendingSet = treeSet.descendingIterator();
		while (descendingSet.hasNext()) {
			Person person = descendingSet.next();
			System.out.println(person.name + ":" + person.age);
		}
	}
}
