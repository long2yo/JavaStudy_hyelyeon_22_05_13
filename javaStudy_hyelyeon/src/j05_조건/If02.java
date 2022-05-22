package j05_조건;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		if(num > 5) System.out.println("5보다 큽니다.");
		else System.out.println("5보다 크지 않습니다.");		
//실행 명령문이 딱 하나일 경우 중괄호({})를 생략할 수 있다.		
//하지만 중괄호를 가독성을 생각해서 써주는게 좋다.		


// else if문		
		
		int score = 85;
		
		if(score == 100) {
			System.out.println("만점입니다.");
		} else if(score > 89) {
				System.out.println("90점 이상입니다.");
		} else if(score > 79) {
				System.out.println("80점 이상입니다.");
		} else {
				System.out.println("...");
		}


		
		

		
		
		
		
	}

}
