package ex05_getInstance;

public class A {
	void methodA() {
		I i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}
