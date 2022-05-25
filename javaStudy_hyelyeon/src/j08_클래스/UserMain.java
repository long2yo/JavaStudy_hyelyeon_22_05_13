package j08_클래스;

public class UserMain {

	public static void main(String[] args) {
		//new User();//생성
		
		//System.out.println(new User());//메모리 주소 출력
										//매번 메모리 주소를 기억할 수 없으므로 
										// 아래와 같이 생성하고 주소를 변수에 담아준다
//		User user1 = new User();
  //자료형태 변수명 = 생성자
		
//		user1.name = "김준일";
//		
//		
//		User user2 = new User();
//		user2.age = "29";
//		
//		System.out.println(user1.name);
//		System.out.println(user1.age);
//		System.out.println(user2.name);
//		System.out.println(user2.age);
		
//		new User();//생성자 호출
//		new User("김준일");
		
		User user1 = new User();
		System.out.println("첫번째: " + user1.name);
		System.out.println("메인메소드에서 호출: " + user1);
//		user1.name = "김준일";
		user1.setName("aaaa");
		System.out.println("두번째: " + user1.name);
		
		User user2 = new User("김땡땡","29","01012345678","부산");
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.phon);
		System.out.println(user2.address);
	}

}
