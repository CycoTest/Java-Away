package runanimal_indirect;

public class RunningAnimal {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
		ani1.setName("Cat");
		ani1.age = 10;
		
		System.out.println(ani1.getName());
		System.out.println(ani1.age);
		
		Animal ani2 = new Animal();
		ani2.setName("Dog");
		ani2.age = 15;
		
		System.out.println(ani2.getName());
		System.out.println(ani2.age);
	}
}
/*
 * 간접적인 접근
 * 	- setName
 * 	- getName
 */
