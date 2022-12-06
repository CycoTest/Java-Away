package ex05_getInstance;

public class B implements I {

	@Override
	public void methodB() {
		System.out.println("methodB in B class");
	}
	
	public String toString() {
		return "class B";
	}
}
