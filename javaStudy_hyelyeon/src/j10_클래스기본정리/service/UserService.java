package j10_클래스기본정리.service;

import java.util.Scanner;
import j10_클래스기본정리.repository.User;

public class UserService {
	
	private Scanner scanner;//전역변수
	
	//private Scanner scanner = new Scanner(System.in);-메모리 주소를 잡아먹는다
	
	public UserService() {
		scanner = new Scanner(System.in);// 이 클래스가 생성되었을때 대입하라
	}
   
	//    유저주소 반환되므로 User
	public User insertUser() {
		shoInsertView();

		String usercode = null;//지역변수
		String email = null;
		String name = null;
		String username = null;
		String password = null;
	 
	 	System.out.print("사용자번호입력:");
	 	usercode = scanner.nextLine();//scanner전역 변수를 사용
	 	System.out.println("이메일");
	 	email = scanner.nextLine();
	 	System.out.println("이름");
	 	name = scanner.nextLine();
	 	System.out.println("사용자이름");
	 	username = scanner.nextLine();
	 	System.out.println("비밀번호");
	 	password = scanner.nextLine();


		User user = new User(usercode, email, name, username, password);
		return user;
	}
	
	//정보은닉 캡슐화
	private void shoInsertView() {
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}
}
