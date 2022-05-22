package j05_조건;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if문
//		
//		int num = 10;
//		
//		if(num > 5) {
//			System.out.println("5보다 큽니다.");
//		}//조건이 참일 때만 출력되는것이 if문
//		
//		if(num < 5) {
//			System.out.println("5보다 작습니다.");
//		}

//if else문	
//if와 else는 한 세트이다.
//		
//		int num = 5;
//		
//		System.out.println("시스템 시작");
//		
//		if(num > 5) {
//			System.out.println("5보다 큽니다.");
//		} else {
//			if(num < 5) {
//				System.out.println("5보다 작습니다.");
//			} else {
//				System.out.println("num이 5입니다.");
//			}
//		} 
//		
//		System.out.println("시스템 종료");
		
// else if문
		
		int num = 5;
		
		System.out.println("시스템 시작");
		
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		} else 
			if(num < 5) {
				System.out.println("5보다 작습니다.");
			} else {
				System.out.println("num이 5입니다.");
			}
		 
		
		System.out.println("시스템 종료");
		
		
		
		
	}

}
