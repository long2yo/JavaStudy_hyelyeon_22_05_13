package j06_반복;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단 2단 출력
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * 2 x 9 = 18
		 * 
		 */

		
//나의 풀이		
//		int dan = 2;
//		int num = 0;
//		
//		
//		while(num < 9) {
//			num++;
//			System.out.println(dan + "x"  + num + "=" + dan*num);
//		}
		
		
//풀이		
		int dan = 2;
		int num = 0;
		
		
		while(num < 9) {
			System.out.println(dan + "x" + (num + 1) + "=" + dan * (num + 1));
			num++;
		}
	}

}
