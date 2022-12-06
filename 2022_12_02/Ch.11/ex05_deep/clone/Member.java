package ex05_deep.clone;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int scores[];
	public Car car;

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	protected Object clone() throws CloneNotSupportedException {
//		먼저 얕은 복사를 하여 name, age를 복제
		Member cloned = (Member) super.clone();
		
//		score를 깊은 복제함
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);

//		car를 깊은 복제함
		cloned.car = new Car(this.car.model);

//		깊은 복제된 Member 객체를 리턴
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}
}
