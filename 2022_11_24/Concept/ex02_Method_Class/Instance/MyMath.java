package ex02_Method_Class.Instance;

public class MyMath {
	long a, b;

//	인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다
	long add() {
		return a + b; // a, b는 인스턴스 변수
	}

	long subtract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	long divide() {
		return a / b;
	}

//	인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다
	static long add(long a, long b) { // a, b는 지역 변수
		return a + b;
	}

	static long subtract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static long divide(long a, long b) {
		return a / b;
	}
}
