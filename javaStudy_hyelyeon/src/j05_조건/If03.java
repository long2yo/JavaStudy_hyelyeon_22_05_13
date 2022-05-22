package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 0보다 작거나 100보다 크면 계산할 수 없는 점수입니다. 출력
		 */
		
//나의 풀이		
//		Scanner scanner = new Scanner(System.in);
//		
//		int score = 0;
//	
//		System.out.println("시험점수: ");
//		score = scanner.nextInt();
//		
//		if(score > 0 || score < 100) {
//			System.out.println("계산할 수 없는 점수입니다.);
//		} else(score >= 90 && score <= 100) {
//			System.out.println("시험점수는 A 입니다.");
//		} else if(score >= 80 && score <= 89) {
//			System.out.println("시험점수는 B 입니다.");
//		} else if(score >= 60 && score >= 69) {
//			System.out.println("시험점수는 C 입니다.")
//		} else if(score >= 60 && score >= 69) {
//			System.out.println("시험점수는 D 입니다.");
//		} else {
//			System.out.println("시험점수는 F 입니다.");
//		}
		
		
//풀이	
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("점수를 입력하세요: ");
		score = scanner.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("계산 할 수 없는 점수입니다.");
		} else if (score > 89) {
			System.out.println("A");
		} else if (score > 79) {
			System.out.println("B");
		} else if (score > 69) {
			System.out.println("C");
		} else if (score > 59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
