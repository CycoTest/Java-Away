package ex04_Polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

//		Original
//		for (int i=1; i<5; i++) {
//			int problemLocation = car.run();
//			
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞왼쪽 HankookTire로 교체");
//				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
//				break;
//			case 2:
//				System.out.println("앞오른쪽 HankookTire로 교체");
//				car.frontRightTire = new HankookTire("앞오른쪽", 13);
//				break;
//			case 3:
//				System.out.println("뒤왼쪽 HankookTire로 교체");
//				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
//				break;
//			case 4:
//				System.out.println("뒤왼쪽 HankookTire로 교체");
//				car.backLeftTire = new HankookTire("뒤왼쪽", 15);
//				break;
//			}
//			System.out.println("===================");
//		}

//		1st Change
		for (int i = 1; i < 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.tires[0] = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 HankookTire로 교체");
				car.tires[1] = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.tires[2] = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.tires[3] = new HankookTire("뒤왼쪽", 15);
				break;
			}
			System.out.println("=======================");
		}

//		2nd Change
		for (int i = 1; i < 5; i++) {
			int problemLocation = car.run();

			String loc[] = { "앞왼쪽", "앞오른쪽", "뒤왼쪽", "뒤오른쪽" };
			int life[] = { 15, 13, 14, 17 };

			if (problemLocation != 0) {
				car.tires[problemLocation - 1] 
						= new HankookTire(loc[problemLocation - 1],
								life[problemLocation - 1]);
			}
		}
		
//		3rd Change
		for (int i = 1; i < 5; i++) {
			int problemLocation = car.run();

			String tireInfo[][] = { 
					{ "앞왼쪽", "앞오른쪽", "뒤왼쪽", "뒤오른쪽" },
					{ "15", "13", "14", "17" }
					};

			if (problemLocation != 0) {
				String num = tireInfo[1][problemLocation - 1];

				car.tires[problemLocation - 1] 
					= new HankookTire(tireInfo[0][problemLocation - 1],
							Integer.parseInt(num));
			}
		}
	}
}
