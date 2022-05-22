package j06_반복;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(1+2+3+4+5+6+7+8+9+10);
		
//		int i = 0;
//		int result = 0;
//		
//		i = i + 1;
//		result = result + i;
//		System.out.println(result);
//		i = i + 1;
//		result = result + i;
//		System.out.println(result);
//		i = i + 1;
//		result = result + i;
//		System.out.println(result);
//		i = i + 1;
//		result = result + i;
//		System.out.println(result);
//		.
//		.
//		.
		

//while문
//참일때만 반복 (참일때까지만 반복한다.)
//거짓일때 반복 x (거짓이되면 멈춘다.)		
		
//		int i = 0;
//		int result = 0;
//		
//		while(i < 100) {
//			i = i + 1;
//			result = result + i;
//			System.out.println(result);
//		}
		
		
//		int i = 0;
//		int result = 0;
//		
//		while(i < 100) {
//			i = i + 1;
//			i += 1;//복합대입연산 - 증가크기를 다양하게 가능
//			i++;   //1씩 증가 가능 - 반복에서 많이 씀
//			++i;   //1씩 증가 가능
//			
//			result = result + i;
//			System.out.println(result);
//		}
		
		
//		int i = 0;
//		int result = 0;
//		
//		while(i < 100) {
//			i++;   //1씩 증가 가능 - 반복에서 많이 씀
//			result = result + i;
//			
//			System.out.println(result);	
//		}
		
//컴퓨터는 항상 0부터 시작
// i++;를 반복문에서 흔히 씀
// 뒤에 i++;를 씀		
//		int i = 0;
//		int result = 0;
//		
//		while(i < 100) {
//			result = result + i++;
//			
//			System.out.println(result);	
//		}
		
		
		int i = 0;
		int result = 0;
		
		while(i < 100) {
			result = result + (i + 1);
			i++;//조건 변화 수식
			
			System.out.println(result);	
		}
		
	}

}
