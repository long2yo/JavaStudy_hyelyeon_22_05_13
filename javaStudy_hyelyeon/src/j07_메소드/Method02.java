package j07_메소드;


// 클래스 안에 정의된 함수를 메소드라고 한다.

public class Method02 {
	
	//메소드
	//메소드는 어디서든 호출 가능
	
	
	// 매개변수가 없으면서 반환도 없는 메소드		//void - 반환(return)할게 없다는 뜻
	public static void test1() {
		System.out.println("test1 메소드 실행");
	}
	
	// 매개변수가 있고 반환이 없는 메소드
	public static void test2(int age, int year) {
		System.out.println("나이: " + age);
		System.out.println("출생년도: " + year);
	}
	
	// 매개변수가 없고 반환이 있는 메소드			//문자열만 반환할 수 있는 메소드
	public static String test3() {					//String - 클래스
		return "으니수달";							//클래스도 반환가능
	}
	
	public static int test4() {						//int - 자료형
		return 10000;
	}
	
		
	// 매개변수도 있고 반환도 있는 메소드					//retune은 딱 하나
	public static String test5(String name, int num) {		//매개변수는 많이 사용가능
		return name + num;
	}
	
	
	// 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법		//break - 반복문을 멈추는 것
	public static void test6() {								        
		for(int i = 0; i < 10; i++) {
		System.out.println(i);
		   if(i == 6) {
	            System.out.println("메소드 탈출");
	            return;
		   }
		}
	}
	
	
	
	//메인 메소드 - 프로그램이 먼저 실행되는 곳
	public static void main(String[] args) {
		System.out.println("메인함수 시작");
		test1(); //호출
		test2(29,1994);
//		test3();
		String name = test3();
		System.out.println(name);
		System.out.println(test5("김준일",1));
//		System.out.println(test3());
		test6();
		System.out.println("메인함수 끝");
		

	}
	
//자바스크립트
// C++ 클래스 밖에 선언되어있는 것을 함수라 한다.	
	
}
