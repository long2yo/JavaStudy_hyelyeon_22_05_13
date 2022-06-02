package j19_제네릭;

import j10_클래스기본정리.repository.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.updateUser());
		System.out.println(controller.getUser().getData());//(CMRespDto<User>)controller.getUser())로 다운 캐스팅
		controller.getAnimal().getData().move();
		
		
//		(CMRespDto<User>)controller.getUser()
	}

}
