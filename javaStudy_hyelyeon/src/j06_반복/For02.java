package j06_반복;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//별 찍는 방법		
//
//		for(int i = 0; i < 5; i++) {
//			System.out.print("*");
//			System.out.println();
//		}
		
		
		
		/* 1번
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * 2번
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 * 3번 
		 *     *
		 *    **
		 *   *** 
		 *  ****
		 * *****
		 * 
		 * 4번
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     
		 * 5번     
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********    
		 */
		
		
//1번		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//2번		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//3번
		 for(int i = 0; i < 5; i++) {
			 for(int j = 0; j < 4 - i; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 0; k < i + 1; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
//4번   
		 for(int i = 0; i < 5; i++) {
			 for(int j = 0; j < i + 1; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 0; k < 4 - i; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
//5번
		 for(int i = 0; i < 5; i++) {
			 for(int j = 0; j+1 < 5 - i; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 0; k < 2 * ( i + 1) - 1; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		
		
		
		
	}

}
