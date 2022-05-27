package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;


public class UserManagementApplication {

	public static void main(String[] args) {
		UserManagementController userManagementController 
		= new UserManagementController();
		
//상속	  new UserManagementController(new UserService());//new UserService() - 주소값
		//회원가입 3명
		userManagementController.createUser();
		userManagementController.createUser();
		//UserManagementController메소드에 담을 수 있는 유저를 2명으로 해놨기 때문에 추가 할 수 없다.
		userManagementController.createUser();
		
		
	}

}
