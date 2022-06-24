package j23_예외처리;

import javax.management.RuntimeErrorException;

public class ThrowEx {

	public static void main(String[] args) {
		try {
			System.out.println("프로그램 실행중...");
			int i = 1;
			
			if(i == 0) {
				throw new ValidationCustomException("예외발생");
//				throw new IndexOutOfBoundsException("인덱스 오류");//강제로 예외를 발생시킴 - 괄호안에 인덱스 번호, 메세지를 넣어줘도 된다.
			}
			
		} catch (Exception e) {
			e.printStackTrace();//예외가 발생되어졌을때 여기서 처리를 함
		}finally {//finally 부분은 무조건 실행이 된다(예외발생 하던 안하던 실행된다.)
			System.out.println("무조건 실행");
		}

	}

}
