package object_oriented;

public class Method_Calling {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	void executed() {
		int result = plus(5, 9);
		System.out.println("result : " + result);
	}

	public static void main(String[] args) {
		Method_Calling myCalc = new Method_Calling();
		myCalc.executed();
	}

}
