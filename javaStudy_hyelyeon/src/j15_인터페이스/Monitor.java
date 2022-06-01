package j15_인터페이스;
					//모니터는 Hdmi, VGA 를 가질 수 있다.(다중 구현이 가능)
					//모니터 자체가 Hdmi는 아니다.(상위클래스와 하위클래스의 관계는 단방향이다.) 
					//기능적 구현은 인터페이스를 쓴다.
//버튼 -> 리모콘 <-> 티비
// 인터페이스   상속
public class Monitor implements Hdmi, VGA {

	@Override
	public void connect() {
	 System.out.println("모니터 연결");	
	}
	
	@Override
	public void disconnect() {
		System.out.println("모니터 연결해제");	
	}
	
	@Override
	public void vgaConnect() {
		System.out.println("vga로 모니터 연결");
	}
}
