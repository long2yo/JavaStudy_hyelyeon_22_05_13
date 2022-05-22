package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 개요 액션,판타지,모험  미국 | 120분 | 2022.05.04개봉
		 * 감독 샘 레이미
		 * 등급 [국내]12세 관람가
		 * 흥행 누적관객 4,987,963명(05.16기준)
		 * 줄거리 지금껏 본 적 없는 마블의 극한 상상력!
				  광기의 멀티버스가 깨어난다
		 */

//나의 풀이		
		Scanner scanner = new Scanner(System.in);
		
		String a = null;
		String b = null;
		String c = null;
		String d = null;
		String e = null;
		
		System.out.print("개요 ");
		a = scanner.nextLine();
		System.out.print("감독 ");
		b = scanner.nextLine();
		System.out.print("등급 ");
		c = scanner.nextLine();
		System.out.print("흥행 ");
		d = scanner.nextLine();
		System.out.print("줄거리 ");
		e = scanner.nextLine();
		
		System.out.println("닥터스트레인지:대혼돈의 멀티버스");
		System.out.println("개요 " + a);
		System.out.println("감독 " + b);
		System.out.println("등급 " + c);
		System.out.println("흥행 " + d);
		System.out.println("줄거리 " + e);
	
		

		
	}

}
