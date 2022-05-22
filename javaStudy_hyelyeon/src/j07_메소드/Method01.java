package j07_메소드;

import java.util.Scanner;

public class Method01 {
	//메서드 - 함수명을 동사 형태로 지어준다.
	//						메소드(매개변수)
	public static int clacFormula1(int a, int b, int c, int d, int e) {//입력
		int result = a + (b * c) - (d * e);
		return result;//반환
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//변수명 - 명사 형태로 지어준다
		int a, b, c, d, e;
		int r1, r2, r3, r4 = 0;
		
		a= scanner.nextInt();
		b= scanner.nextInt();
		c= scanner.nextInt();
		d= scanner.nextInt();
		e= scanner.nextInt();

		//메서드 호출
		r1 = clacFormula1(a, b, c, d, e);//호출 - 메서드 호출
		//r1 = a + (b * c) - (d * e);
		// 소스코드 만줄
		r2 = clacFormula1(10, 20, 5, 30, 2);//호출
		//r2 = a + (b * c) - (d * e);
		// 소스코드 천줄
		r3 = clacFormula1(a, b, c, d, e);//호출
		//r3 = a + (b * c) - (d * e);
		// 소스코드 이천줄
		r4 = clacFormula1(a, b, c, d, e);//호출
		//r4 = a + (b * c) - (d * e);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
