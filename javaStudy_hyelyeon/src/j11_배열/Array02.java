package j11_배열;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//		int size = 4;
//		int[] numbers = new int[size];//인덱스랑 다르다.
									  //갯수를 뜻한다.
//		
//		System.out.println(numbers.length);
		
		
		/*
		 * for문으로 0 ~ 99까지 반복을 한다.
		 * 변수 i의 값이 8의 배수이면 
		 * 8의 배수 갯수만큼 배열을 생성하고
		 * 8의 배수를 모두 배열에 대입한다.
		 * 배열에 들어있는 8의 배수들을 모두 출력하시오. 
		 * 
		 */
		
		
//풀이 
		
		
		int size = 0;
		
		for(int i = 0; i < 100; i++) {
				if(i != 0 && i % 8 == 0) {
						size++;
			}
		}

		int[] numbers = new int[size];//size변수의 크기에 해당하는 배열 생성
		
		for(int i = 0, j = 0; i < 100; i++) {
			if(i != 0 && i % 8 == 0) {
				numbers[j] = i;
				System.out.println(numbers[j]);
				j++;
			}
		}
		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
	
		
		
	}

}
