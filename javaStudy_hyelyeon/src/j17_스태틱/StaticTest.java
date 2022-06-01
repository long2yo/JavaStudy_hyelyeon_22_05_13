package j17_스태틱;

public class StaticTest {
					 //cnt
	public static int count;
	
	//private static int count; - 외부에 공유안된다.

	public static void staticMethod() {
		System.out.println("스태틱 메소드 [ " + count + " ]");
		//out - 스태틱
	}
	
	
}
