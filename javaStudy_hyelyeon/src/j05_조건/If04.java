package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * x == 0 || y == 0
		 * 계산불가
		 * x == 0 && y == 0
		 * 원점
		 * x or y
		 * -1000 ~ 1000 사이가 아니면 계산 불가
		 */

//나의 풀이	
//		Scanner scanner = new Scanner(System.in);
//		
//		int x = 0;
//		int y = 0;
//		
//		System.out.println("x좌표값을 입력하세요.");
//		x = scanner.nextInt();
//		System.out.println("y좌표값을 입력하세요.");
//		y = scanner.nextInt();
//		
//		if(x == 0 && y == 0) {
//			System.out.println("원점입니다.");
//		} else if (x == 0 || y == 0) {
//			System.out.println("계산이 불가합니다.");
//		} else if (x > 1000 || x < -1000 || y > 1000 || y < -1000) {
//			System.out.println("계산이 불가합니다.");
//		} else if (x > 0 && y > 0) {
//			System.out.println("1사분면 입니다.");
//		} else if (x < 0 && y > 0) {
//			System.out.println("2사분면 입니다.");
//		} else if (x < 0 && y < 0) {
//			System.out.println("3사분면 입니다.");
//		} else {
//			System.out.println("4사분면 입니다.");
//		}
		
		
//풀이		
//삼항 연산자는 결과만 나타난다.
//if else는 또 다른 명령을 줄 수 있다.		
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.println("x:");
		x = scanner.nextInt();
		System.out.println("y:");
		y = scanner.nextInt();
		
		if((x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0) 
				&& (x != 0 || y != 0)) {
			System.out.println("계산불가");
		} else if(x > 0 && y > 0) {
			System.out.println("1사분면");
		} else if(x < 0 && y > 0){
			System.out.println("2사분면");
		} else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		} else if(x > 0 && y < 0){
			System.out.println("4사분면");
		} else {
			System.out.println("원점");
		}
		
		
//else if문을 삼항연산자로 나타내보기		
		String result = (x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0) 
				&& (x != 0 || y != 0) ? "계산 불가"
						:x > 0 && y > 0 ? "1사분면"
								:x < 0 && y > 0 ? "2사분면"
										:x < 0 && y < 0 ? "3사분면"
												:x > 0 && y < 0 ? "4사분면" : "원점";
		System.out.println(result);		
		
		
		
	}

}
