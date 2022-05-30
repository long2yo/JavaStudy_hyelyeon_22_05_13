package j12_상속;

//		자식클래스  상속  부모클래스
public class Test1 extends Test {
	
	public Test1() {
		super();//super(); - 부모클래스 생성(및 부모의 주소를 나타냄)   / this(); - 자신
				//항상 위에 써야함.
				//(자식보다 먼저 super();가 위에 있어야 된다. 자식보다 아래에는 x)
				//기본은 생략되어져 있다.
		
		
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인: " + super.toString());//부모의 주소값 출력
	}
	
	
	
	
	
//	public void testPrint() {
//		System.out.println("부모 클래스(Test)");
//	} 
// 보이진 않아도 상속받아서 쓸수 있다.	
	
//	public void test1Print() {
//		testPrint();
//	}
}
