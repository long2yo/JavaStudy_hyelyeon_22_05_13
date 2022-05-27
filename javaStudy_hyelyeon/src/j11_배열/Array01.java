package j11_배열;

public class Array01 {

	public static void main(String[] args) {
	
		//1. 배열의 공간(크기)을 정해서 생성
		int[] numbers = new int[10];//int자료형의 10개의 배열을 하나로 묶어서 numbers에 넣어라.
		
		
		//2. 배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//괄호안에 들어있는 갯수만큼 공간을 만든다.
		char[] character = {'a', 'b', 'c', 'd', 'e'}; 
		boolean[] booleans = {true, true, true, false, false, false};
		
		String[] strArray = new String[5];//String은 클래스이다.
										  //클래스도 배열로 표현할 수 있다.
										  //String의 기본값은 null이다.
										  //즉,모든 클래스의 기본값은 null이다.
		String str = "test";//클래스는 주소값을 갖는다. 
							//클래스 주고값을 비우고 싶으면 null을 넣어준다.
		
		
		// 배열변수명.length - 알아서 배열의 공간 갯수를 세어준다
		System.out.println("numbers의 길이: " + numbers.length);
		System.out.println("strArray의 길이: " + strArray.length);
		
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("i: " + i);
			System.out.println("numbers: " + numbers[i]);//공간만 만드는 거기 때문에 0 출력
			System.out.println("numbers2: " + numbers2[i]);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}//0번째 주소값은 null이다 -> null이란 주소값이 없다는 뜻
		
		
//리터럴 상수 = 이미 정해져있는 값
//주소값을 외울수 없으므로 변수값을 쓰고있는거다.		
				
//				int number1 = 1;
//				int number2 = 2;
//				int number3 = 3;
//				int number4 = 4;
//				int number5 = 5;
//				int number6 = 6;
//				
//				System.out.println();		
		//배열자료형[] 변수명 = 생성 배열자료형		
//		int[] numbers = new int[10];
		
//		numbers[0] = 10;		
//		numbers[1] = 20;
		
		//System.out.println(numbers);//주소값
//		System.out.println(numbers[0]);//0번 인덱스에 들어있는 값
		
	}

}
