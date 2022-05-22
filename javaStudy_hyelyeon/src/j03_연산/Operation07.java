package j03_연산;

public class Operation07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4의 배수 (이면서)&& 100의 배수가 (아니거나)|| 400의 배수
		 * 참이면 윤년
		 * 거짓이면 윤년이 아님
		 * 
		 */
		
//나의 풀이
//		int year = 1999;
//		
//		String result = null;
//		
//		result = year % 4 == 0 && 100 != 0 || year % 400 == 0 ? "윤년" : "윤년이 아님";//변수명 선언은 한번만 하고 이후 부터는 그냥 쓴다.
//		//boolean result1 = year % 4 == 0 && 100 != 0 || year % 400 == 0 true : false;
//		
//		System.out.println("결과: " + result);
		

//풀이
		int year = 1999;//2000년은 윤년
		
		String result = null;
		
		result = year % 4 == 0
				&& year % 100 != 0
				|| year % 400 == 0 ? "윤년" : "윤년이 아님";
		
		System.out.println("결과: " + result);
		
	}

}
