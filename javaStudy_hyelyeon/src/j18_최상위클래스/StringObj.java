package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "김준일";//리터럴 값 자체가 주소이므로 
		String name2 = "김준일";//값의 주소가 같다
		
		System.out.println(name == name2);//true - 변수값을 비교
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름1: ");
		name = scanner.nextLine();//new 되어서 생성되므로 주소 비교
		System.out.print("이름2: ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);//false - 주소값 비교
		
		
		name = new String("김준일");
		name2 = new String("김준일");
		
		System.out.println(name == name2);//false - 주소값 비교
		System.out.println(name.equals(name2));//equals - 이 name과 name2 값이 같니?라고 물어보는 것
		
		
	}

}
