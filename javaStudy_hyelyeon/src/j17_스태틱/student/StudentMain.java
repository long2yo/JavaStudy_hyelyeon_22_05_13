package j17_스태틱.student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student s1 = new Student(1, "김준일", 1);
//		Student s2 = new Student(2, "김준이", 3);
//		Student s3 = new Student(3, "김준삼", 3);
//		Student s4 = new Student(4, "김준사", 2);
//		Student s5 = new Student(5, "김준오", 1);
		
		Student s1 = new Student("김준일", 1);
		Student s2 = new Student("김준이", 3);
		Student s3 = new Student("김준삼", 3);
		Student s4 = new Student("김준사", 2);
		Student s5 = new Student("김준오", 1);
		
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		s5.showInfo();
		
		
	}

}
