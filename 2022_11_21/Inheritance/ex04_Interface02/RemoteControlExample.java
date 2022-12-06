package ex04_Interface02;

public class RemoteControlExample {
	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl();
//		Cannot instantiate the type of RemoteControl

		RemoteControl rc1 = new Audio();
		rc1.turnOn();
		rc1.turnOff();

		RemoteControl rc2 = new RemoteControl() {
//		반면에, RemoteControl 인스턴스를 바로 실체화해주면 컴파일 에러 메세지가 뜨지 않음
			@Override
			public void turnOn() {
				System.out.println("RemoteControl - turnOn()");
			}

			@Override
			public void turnOff() {
				System.out.println("RemoteControl - turnOff()");
			}

			@Override
			public void setVolum(int volume) {

			}
		};

		rc2.turnOn();
		rc2.turnOff();
	}
}
