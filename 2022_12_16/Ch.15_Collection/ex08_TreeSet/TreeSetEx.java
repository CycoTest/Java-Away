package ex08_TreeSet;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();

		scores.add(Integer.valueOf(87));
		scores.add(98);
		scores.add(Integer.valueOf(75));
		scores.add(95);
		scores.add(Integer.valueOf(80));

		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);

		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);

		score = scores.lower(Integer.valueOf(95));
		System.out.println("95점 아래 점수 : " + score);

		score = scores.higher(95);
		System.out.println("95점 위 점수 : " + score);

		score = scores.floor(95);
		System.out.println("95점 이거나 바로 아래 점수 : " + score);

		score = scores.ceiling(Integer.valueOf(85));
		System.out.println("85점 이거나 바로 위 점수 : " + score + "\n");

		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
		}
	}
}
