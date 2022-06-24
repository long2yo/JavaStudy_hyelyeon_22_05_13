package j23_예외처리;

//우리만의 RuntimeException을 하나 만든 것
public class ValidationCustomException extends RuntimeException{

	/*
	 * 
	 */
	private static final long serialVersionID = 1L;
	
	public ValidationCustomException() {
		super();
		System.out.println("우리가 만든 예외");
	}
	
	public ValidationCustomException(String message) {
		super(message);
		System.out.println("우리가 만든 예외 메세지 있음");
	}
	
	
}
