package j01_첫수업;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ctrl + F11 -> console창 열기
		
//		클래스명은 대문자로 작성
//		명령 소스코드는 main안에 써야된다.
		
		System.out.print("Hello, Java");
		System.out.println("Hello, Java");
		System.out.print(10+5);
		System.out.println();
		
		int age = 29;//변수
//		age = 10;
		
//		double age = 10.4; - 변수명 중복 x
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = 30;
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = age + 1; //대입 -> 30 + 1 = 31을 age에 대입
		System.out.println(age);
		
	}

}