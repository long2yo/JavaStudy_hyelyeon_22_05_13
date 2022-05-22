package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
//		Scanner scanner; //대문자로 시작하는 자료형을 참조형 자료형이라 한다.
//		소문자로 시작하는 자료형을 일반 자료형이라 한다.
//		Scanner scanner = new Scanner(System.in);//ctrl + shift + O - import 단축키
//
		 Scanner scanner = new Scanner(System.in);
		 
//		 System.out.println("값 입력: ");
//		 int num1 = scanner.nextInt();
//		 System.out.println("입력한 값: " + num1);
//		 
//		 System.out.println("값 입력");
//		 int num2 = scanner.nextInt();
//		 System.out.println("입력한 값: " + num2);
		
		 System.out.println("첫번째 값 입력: ");
		 int num1 = scanner.nextInt();
		 System.out.println("두번째 값 입력: ");
		 int num2 = scanner.nextInt();
		 
		 System.out.println("입력한 값: " + (num1 + num2));
		 
		 scanner.next();			//문자열(String)
		 scanner.nextLine();		//문자열(String)
		 scanner.next().charAt(0);	//문자(char)
		 scanner.nextInt();			//정수(int)
		 scanner.nextDouble();		//실수(double)

//과제 - 윤년 문제 Scanner 사용하여 문제 풀어오기
		 
		 	/*
			 * 4의 배수 (이면서)&& 100의 배수가 (아니거나)|| 400의 배수
			 * 참이면 윤년
			 * 거짓이면 윤년이 아님
			 * 
			 */

//나의 풀이		
//		 Scanner scanner = new Scanner(System.in);
//		 
//		 System.out.println("년도 입력: ");
//		 
//		 int year = scanner.nextInt();
//		 		 
//		 System.out.print(year + "년도는 ");
//		 System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년입니다." : "윤년이 아닙니다.");
				 
		 
	}

}
