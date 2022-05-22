package j07_메소드;

import java.util.Scanner;

// 메소드 오버로딩

//오버로딩이란? 매개변수가 다르다
//리턴되는 자료형은 중요하지 않다.

public class Method03 {

	public static void test1( ) {
		System.out.println("매개변수가 없는  test1 호출");
	}
	
	public static void test1(int num) {
		System.out.println("int자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num, int num2) {
		System.out.println("int자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void test1(double a) {									//자료형이 중요하다 
		System.out.println("double자료형 매개변수가 하나인 test1 호출");	//변수명은 여러개일 필요가 없다
	}
	
	public static void test1(int num, double dnum) {
		System.out.println("int자료형 다음에 double자료형 매개변수가 둘인 test1 호출");
	}
	
    public static void test1(double num2, int num) {
       System.out.println("double 자료형 다음에 int 자료형 매개변수가 2개인 test1 호출");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1();
		test1(10);
		test1(10,20);
		test1(3.14);
		test1(10,3.14);
		
		

		
	}

}
