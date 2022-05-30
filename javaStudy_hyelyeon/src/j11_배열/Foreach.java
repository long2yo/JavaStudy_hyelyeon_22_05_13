package j11_배열;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		/*
		 * 1, 2, 3, 4, 5, 6, 7, 8
		 */
		
		
		
		
		
		
		
//풀이1		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i]);
//			if(numbers.length-1 != i) {
//				System.out.print(", ");
//			}
//		}
//		System.out.println();
		
		
//*풀이2		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length-1 != i ?  ", " :""));
		}


		
		System.out.println();
//Foreach		
//		for(int num : numbers) {
//			System.out.println(num);
//		}
		
		
	      int i =0;
	      for(int num : numbers) {
	         System.out.print(num + (numbers.length-1 != i ? ", " : "" ));
	         i++;
	      }



	}
}
