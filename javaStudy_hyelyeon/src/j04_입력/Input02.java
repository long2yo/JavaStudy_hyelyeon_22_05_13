package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 문자열1 입력: nextLine()		hi
		 * 문자열2 입력: next()			안녕
		 * 문자 입력: next().charAt(0)	A
		 * 정수 입력: nextInt()			10
		 * 실수 입력: nextDouble()		3.14
		 * 
		 */
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("문자열1 입력: ");
//		String num1 = scanner.nextLine();
//		
//		System.out.println("문자열2 입력: ");
//		String num2 = scanner.next();
//		
//		System.out.println("문자 입력: ");
//		char num3 = scanner.next().charAt(0);	
//		
//		System.out.println("정수 입력: ");
//		int num4 = scanner.nextInt();
//		
//		System.out.println("실수 입력: ");
//		double num5 = scanner.nextDouble();
//		
//		
//		System.out.println("문자열1 입력: " + num1);
//		System.out.println("문자열2 입력: " + num2);
//		System.out.println("문자 입력: " + num3);
//		System.out.println("정수 입력: " + num4);
//		System.out.println("실수 입력: " + num5);
		
		
//풀이 		
		Scanner scanner = new Scanner(System.in);
		
		String a = null;
		String b = null;
		char c = 0;
		int d = 0;
		double e = 0;
		
		System.out.println("문자열1 입력: ");
		a = scanner.nextLine();
		System.out.println("문자열2 입력: ");
		b = scanner.next();
		System.out.println("문자 입력: ");
		c = scanner.next().charAt(0);
		System.out.println("정수 입력: ");
		d = scanner.nextInt();
		System.out.println("실수 입력: ");
		e = scanner.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		
		
	}

}
