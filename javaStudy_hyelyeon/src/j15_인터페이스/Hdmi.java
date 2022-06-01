package j15_인터페이스;

/*
 *  인터페이스(interface)
 *  
 *  약속
 *  클래스와 클래스를 연결할 때 동일한 인터페이스로만 연결 가능
 *    
 *  1. 기본적으로 모든 메소드는 추상 메소드이다. 
 *  2. 일반 메소드를 사용하고 싶다면 return type 앞에 default 키워드를 사용하여야 한다.
 *  3.
 */

public interface Hdmi {

	public void connect();//인터페이스의 기본 메소드는 추상메서드
	public void disconnect();
//	public default void disconnect() {//일반 메소드 사용시 인터페이스는 추상클래스랑 반대로 default 사용
//
//	}

	
}
