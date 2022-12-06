package ex08_Inheritance.Relationship1;

public class Circle extends Shape {
	Point center;
	int r;

	Circle() {
		this(new Point(0, 0), 100);
	}

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	void draw() {
		System.out.printf("[color=(%d, %d), r=%d, color=%s]\n", 
				center.x, center.y, r, color);
	}
}
