package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		SmartPhone smartPhone = new SmartPhone(beamProjector);
//		Hdmi hdmi = new Hdmi();
		smartPhone.powerOn();
		smartPhone.powerOff();

	}

}
