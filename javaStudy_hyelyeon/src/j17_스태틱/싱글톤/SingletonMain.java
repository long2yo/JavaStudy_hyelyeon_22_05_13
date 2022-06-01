package j17_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 싱글톤
		 * 1. 유일한 객체(인스턴스)를 생성해야한다.(외부에서 호출할 수 없도록 생성자를 무조건 private)
		 */
		
		
		
		Singleton singleton = Singleton.getInstance();//
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance();//외부에서 호출할 수 없도록 생성자를 무조건 private
		singleton2.setCount(10);
		singleton2.printInfo();
	}

}
