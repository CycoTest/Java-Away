package ex02_BasicConcept;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		System.out.println("model : " + dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);

		System.out.println("channel : " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕하세요. 홍길동입니다");
		dmbCellPhone.sendVoice("네, 반갑습니다.");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
