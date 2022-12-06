package ex04_thin.clone;

public class MemberEx {
	public static void main(String[] args) {
		Member original = new Member("blue", "홍길동", "12345", 25, true);

		Member cloned = original.getMember();
		cloned.password = "67890";

		System.out.println("[복제 객체의 필드값]");
		System.out.printf("id : %s\n", cloned.id);
		System.out.printf("name : %s\n", cloned.name);
		System.out.printf("password : %s\n", cloned.password);
		System.out.printf("age : %d\n", cloned.age);
		System.out.printf("adult : %s\n", cloned.adult);
		System.out.println();

		System.out.println("[원본 객체의 필드값]");
		System.out.printf("id : %s\n", original.id);
		System.out.printf("name : %s\n", original.name);
		System.out.printf("password : %s\n", original.password);
		System.out.printf("age : %d\n", original.age);
		System.out.printf("adult : %s\n", original.adult);
	}
}
