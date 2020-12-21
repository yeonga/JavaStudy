package part7_1;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//DmbCellPhone 클래스의 필드 
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세여");
		dmbCellPhone.receiveVoice("안녕하세여! 저는 피자라고 하는데여!");
		dmbCellPhone.sendVoice("어머! 피자야~~");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 클래스의 메소드 호출 
		dmbCellPhone.turnOnDMb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
