package j17_스태틱.싱글톤;

/*
 * 1. 생성자는 private으로 지정하여 외부에서 생성 할 수 없게 만들어야한다.
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance를 return해줄 수 있는 
 * 	  getInstance() static 메소드가 존재해야 한다.
 * 3. 싱글톤 instance를 저장할 변수명이 instance인 static 변수가 존재해야 한다.
 */

public class Singleton {
	//인스턴스 생성 									//Singleton(class)인스턴스 생성  -> instance 하나를 생성하여 
	private static Singleton instance = new Singleton();//생성되면 static 변수에 들어가있어야 한다.
	private int count;									//외부에서 접근 불가
	
	//생성자는 private
	private Singleton() {}//외부에서 호출할 수 없도록 생성자를 무조건 private
	
			//반환자료형 Singleton (class)
	public static Singleton getInstance() {	//static메소드를 통해서 외부로 가져다 줄 수 있다.
		if(instance == null) {				//static은 생성하지 않아도 호출이 가능
			instance = new Singleton();
		}
		return instance;
	}

	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트 -> " + count);
	}
}
