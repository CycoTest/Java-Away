package ex05_deep.clone;

public class MemberEx {
	public static void main(String[] args) {
		Member original = new Member("홍길동", 25, new int[] { 90, 80 }, new Car("소나타"));

		Member cloned = original.getMember();
		cloned.scores[0] = 101;
		cloned.car.model = "K5";

		System.out.println("[복제 객체의 필드값]");
		System.out.printf("name : %s\n", cloned.name);
		System.out.printf("age : %d\n", cloned.age);
		System.out.print("scores : {");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == (cloned.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.printf("car : %s\n", cloned.car.model);
		System.out.println();

		System.out.println("[원본 객체의 필드값]");
		System.out.printf("name : %s\n", original.name);
		System.out.printf("age : %d\n", original.age);
		System.out.print("scores : {");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i == (original.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.printf("car : %s\n", original.car.model);
		System.out.println();
	}
}
