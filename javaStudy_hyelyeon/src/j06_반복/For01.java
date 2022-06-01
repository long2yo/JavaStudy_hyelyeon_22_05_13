package j06_반복;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기식; 조건식; 조건변화식) { }
		//	선언	조건	조건
//		for(int i = 0; i < 5; i++) {
//			System.out.println(i + 1);
//		}

		
//-------------------------------------------------------------		
		
		//for(1.초기식; 2.조건식; 4.조건변화식) {
//					3.
//		  }
//
//1 -> 2 -> 3 -> 4 -> 2 /true면 -> 3 -> 4 -> 2 반복		
		

//--------------------------------------------------------------


//for - 규칙적으로 반복할 때 쓴다. 
//		for(; true;) {
//			System.out.println(i + 1);
//		}
//
//while - 자유롭게 반복하고 싶을때 쓴다.
//		while(true) {
//			System.out.println(i + 1);
//		}
		
//---------------------------------------------------------------

//1~10까지 반복문		
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		
//10~1까지 반복문		
		for(int i = 0; i < 10; i++) {//10번 반복해라
			System.out.println(10 - i);
		}

	}

}
