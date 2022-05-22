package j03_연산;

public class Operation06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num = 10;
//		String principal = "test";
//		System.out.println(principal);// P + ctrl + space
		
		int num = 80;
		
		String result = num % 4 == 0 ? "4의 배수" : "4의 배수가 아님";//결과 값이 문자열이므로 String
		boolean result2 = num % 4 == 0 ? true : false;//결과값이 true, false이므로 boolean
		int result3 = num % 4 == 0 ? 1 : 0;//결과값이 정수 이므로 int
		//ctrl + alt + 방향키 - 복사 
		//ctrl + shift + L - 단축키를 볼 수 있다
		
		System.out.println(num % 4 == 0 ? "4의 배수" : "4의 배수가 아님");
		//참이면 : 의 왼쪽, 거짓이면 : 의 오른쪽을 출력
	}

}
