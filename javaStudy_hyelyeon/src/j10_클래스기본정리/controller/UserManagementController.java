package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	private UserService userService;//전체 메서드에 사용가능하게 전역변수로 만든다.
						
	public UserManagementController() {
		userService = new UserService();//전역변수를 사용하기 위해서 생성
	}
	
//	상속을 배우면 아래와 같이 코드를 쓸수있다.
//	public UserManagementController(UserService userService) {
//		this.userService = userService;
//	}
	
	public void createUser() {
		User user = userService.insertUser();//생성한 것에 접근하고 user에 저장
		
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());//User안에 있는 toString을 호출
	}
	

	
	public void updateUser() {
		
	}

}
