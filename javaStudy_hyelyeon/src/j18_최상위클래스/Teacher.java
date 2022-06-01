package j18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스)
 * 
 * 
 * Object - 객체       
 * Object는 모든 클래스 마다 상속이 되어있다. 
 * 기본은 생략되어져 있다.
 *  
 */

public class Teacher extends Object{
	private String name;
	private String subject;
	private int age;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	

	
	
	@Override
	public int hashCode() {// hashCode() - 주소값(실제 메모리 주소) / int 자료형으로 만들어져있다.
		return Objects.hash(age, name, subject);//주소값을 하나 만들어준다.
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//instanceof랑 동일한 역할(class는 같다)
			return false;
		Teacher other = (Teacher) obj;//obj 다운캐스팅
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	

	public void classInfo() {
		System.out.println();
	}
	

//	@Override
//	public String toString() {//이 객체가 가지고 있는 변수들의 값을 확인해준다.
//		// TODO Auto-generated method stub
//		return "이름: " + name + ", 과목: " + subject;
//	}
	
	
	
	
	
	
	
}
