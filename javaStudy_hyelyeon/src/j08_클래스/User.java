package j08_클래스;

public class User {

	String name;
	String age;
	String phon;
	String address;
	
	//생성자 
	//클래스명과 같다.
	//반환자료형이 없다
	//자료형이 다르면 오버로딩 된다.
	
	//기본생성자
	User() {
		System.out.println("생성.");
	}
	
	//사용자정의 생성자
	User(String name) {
		System.out.println(name);
		this.name = name;//생성할때 this.name에 저장도 가능하다
	}					 //this.name : (this.)자기 자신 안에 있는 (name)변수에 저장한다는 뜻
	
	User(String name, String age, String phon, String address) {
		this.name = name;
		this.age = age;
		this.phon = phon;
		this.address = address;
	}
	
	void setName(String a) {
		System.out.println("setName 메소드 안에서 호출: " + this);
		this.name = name;
	}
	
	//메소드
	//반환자료형을 꼭 명시
	
	
}
