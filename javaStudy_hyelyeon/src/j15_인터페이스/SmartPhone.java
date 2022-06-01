package j15_인터페이스;


public class SmartPhone {
	
	private final Hdmi hdmi;//상수는 선언을 하면 무조건 값이 들어가야 된다.
	
	public SmartPhone(Hdmi hdmi) {
		this.hdmi = hdmi;
	}
	

	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
		hdmi.connect();
	}
	
	public void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
		hdmi.disconnect();
	}
	

}
