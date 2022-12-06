package ex02_Interface;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		Marine marine = new Marine();
		SCV scv = new SCV();

		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine);
	}
}
