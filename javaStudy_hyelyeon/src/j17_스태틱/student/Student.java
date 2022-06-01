package j17_스태틱.student;

public class Student {
/*
 * student_code(정수) - 변수
 * student_name(이름)
 * student_year(학년)
 * 
 * 학생을 한명 생성할때마다 자동으로 student_code의 값이 1씩 증가하여 부여될 수 있게 작성.
 * 20220001
 * 20220002
 * 
 */

//나의 풀이	
	
//	private int student_code;
//	private String student_name;
//	private int student_year;
//	
//	
//	
//	public Student(int student_code, String student_name, int student_year) {
//		super();
//		this.student_code = student_code;
//		this.student_name = student_name;
//		this.student_year = student_year;
//	}
//
//
//	public void showInfo() {
//		System.out.println("학번: " + 2022000 + student_code);
//		System.out.println("이름 :" + student_name);
//		System.out.println("학년: " + student_year);
//	}
	
	
	
//풀이

//	private int student_code = 20220000;//기본값으로 20220000를 넣어둠
//	private String student_name;
//	private int student_year;
//	
//	
//	
//	public Student(int student_code, String student_name, int student_year) {
//		this.student_code += student_code;//기존값에다가 더해준다
//		this.student_name = student_name;
//		this.student_year = student_year;
//	}
//
//
//	public void showInfo() {
//		System.out.println("학번: " + student_code);
//		System.out.println("이름 :" + student_name);
//		System.out.println("학년: " + student_year);
//		System.out.println();
//	}
	

//static 활용 해서 풀이
	
	//외부에서 건드리면 안되기 때문에 static을 private으로 줌
	private static int auto_increment = 20220000;
	private int student_code;
	private String student_name;
	private int student_year;
	
	
	//ctrl+shift+s - 전체생성자 단축키
	public Student(String student_name, int student_year) {
		this.student_code = ++auto_increment;
		this.student_name = student_name;
		this.student_year = student_year;
	}


	public void showInfo() {
		System.out.println("학번: " + student_code);
		System.out.println("이름 :" + student_name);
		System.out.println("학년: " + student_year);
		System.out.println();
	}
	
}
