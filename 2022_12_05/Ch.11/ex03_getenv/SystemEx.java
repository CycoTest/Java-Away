package ex03_getenv;

public class SystemEx {
	public static void main(String[] args) {
		String javaHome = System.getenv("Path");

		System.out.printf("Path : %s\n", javaHome);
	}
}
