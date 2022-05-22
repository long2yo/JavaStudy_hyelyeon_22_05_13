package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [개인정보 입력]
		 * 이름: 김땡땡					문자열	name
		 * 나이: 29						정수	age
		 * 연락처: 010-1234-5678		문자열	phone
		 * 주소: 부산 동래구 땡땡동		문자열	address
		 * 성별: 남						문자	gender
		 * 
		 * 
		 * [개인정보 출력]
		 * 이름 => 김땡땡					문자열
		 * 나이 => 29						정수
		 * 연락처 => 010-1234-5678			문자열
		 * 주소 => 부산 동래구 땡땡동		문자열
		 * 성별 => 남						문자
		 * 
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		System.out.println("[개인정보 입력]");//김땡땡\n29\n010-1234-5678\n
		System.out.print("이름: ");
		name = scanner.next();		//김땡땡\n(\n은 버퍼에 남아있다)
		System.out.print("나이: ");
		age = scanner.nextInt();	//29\n(\n 버퍼를 날림)
		System.out.print("연락처: ");
		phone = scanner.next();		//010-1234-5678\n(\n은 버퍼에 남아있다)
		scanner.nextLine();			//\n 남아있던 버퍼를 날려줌
		System.out.print("주소: ");
		address = scanner.nextLine();
		System.out.print("성별: ");
		gender = scanner.next().charAt(0);
		
		System.out.println("[개인정보 출력]");		
		System.out.println("이름 => " + name);	
		System.out.println("나이 => " + age);	
		System.out.println("연락처 => " + phone);
		System.out.println("주소 => " + address);
		System.out.println("성별 => " + gender);
		
		
		//문자열인데 띄어쓰기 하는 경우
		//nextLine(); -  사용
		//			     space 또는 Enter를 포함한다. 허용한다.
		
		//문자열 띄어쓰기를 하는 경우에 next();를 사용하면 뒤에는 출력안됨
		//next(); - 입력받은 값은 여기까지 입니다.
		//			버퍼로 인해 space 또는 Enter 까지 담는다.
		//          space 또는 Enter를 무시한다.- 부산동래구땡땡동
		

		
		
		
//		Scanner scanner = new Scanner(System.in);
//		String adderss = null;
//		
//		System.out.println("주소: ");
//		address = scanner.nextLine();
//		
//		System.out.println("주소: " + address);
		
//		Scanner scanner = new Scanner(System.in);
//		
//		String address1 = null;
//		String address2 = null;
//		String address3 = null;
//		String phone = null;
		

		
//		System.out.println("주소: ");
//		address1 = scanner.next();
//		address2 = scanner.next();
//		address3 = scanner.next();
//		System.out.println("연락처: ");
//		phone = scanner.nextLine();
//		
//		System.out.println("주소: " + address1 + address2 + address3);
//		System.out.println("연락처: " +phone);
//		
		
		
		
		
		

	}

}
