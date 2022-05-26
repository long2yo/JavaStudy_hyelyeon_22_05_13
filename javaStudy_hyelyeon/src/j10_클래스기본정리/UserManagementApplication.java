package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;
import j10_클래스기본정리.service.UserService;

public class UserManagementApplication {

	public static void main(String[] args) {
		UserManagementController userManagementController 
		= new UserManagementController();
//상속	  new UserManagementController(new UserService());//new UserService() - 주소값
		userManagementController.createUser();
		
		
	}

}
