package j08_클래스;

public class FishBun {
//클래스는 변수와 메소드로 구성
//클래스는 틀이다.
//클래스명은 무조건 첫글자 대문자
	
	//변수선언
	String material; //재료
	String dough; //반죽
	
	
	//생략 되어있다
	FishBun(){ 									  //생성자(이 클래스를 생성해주는 생성자이다.				
			System.out.println("생성자 호출");	  //반환자료형도 없고 대문자로 시작한다
	}											  //메모리 주소이다.
	
	
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}
}
