package j17_스태틱.싱글톤.factory;

public class KIA {

	private static KIA instance;
	private int serial_auto_increment = 20220000;//인스턴스를 통해서 공유된다
	
	//생성자
	private KIA() {}
	
	//전체생성자
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	//일련번호는 무조건 안겹치게 1식 증가 
	public Car createCar(String model) {
		return new Car(++serial_auto_increment, KIA.class.getSimpleName(), model);
	}
	
	//차에 대한 정보출력
	public void carInfo(Car car) {
		System.out.println(car.toString());
	}
}
