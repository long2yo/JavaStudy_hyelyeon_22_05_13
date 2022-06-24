package j23_예외처리;

public class Throws01Main {
	
	//오류가 날 거 같은 부분에는 throws Exception을 달아 준다.
	public  void test() throws Exception {
		Throws01 throws01 = new Throws01();
		
		throws01.printArray(new int[]{1,2,3,4,5,6,7,8,9});
	}
	
	
	public static void main(String[] args) { 
	      Throws01Main main = new Throws01Main();
	      
	      try {
			main.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	      System.out.println("프로그램 종료");
	}
}
