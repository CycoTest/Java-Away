package ex02_super.method;

class Point2 {
	int x = 10;
	int y = 20;

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2 {
	int z = 30;

	Point3D2() {
		this(100, 200, 300);
	}

	Point3D2(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}

public class PointTest2 {
	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();

		System.out.printf("p3.x= %d\n", p3.x);
		System.out.printf("p3.y= %d\n", p3.y);
		System.out.printf("p3.z= %d\n", p3.z);
	}
}
