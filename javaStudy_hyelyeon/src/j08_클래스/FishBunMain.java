package j08_클래스;

public class FishBunMain {
//	String name = "junil"; - 메서드 밖에서는 변수선언 x 
	public static void main(String[] args) {
	// 	 자료형 변수  	= 값   
		FishBun fishBun = new FishBun(); //new - 새롭게 만들겠다.
										 //FishBun(); - 호출 => 생성자
										 //new FishBun(); => 인스턴스 (메모리 주소(fishBun)에 저장)
										 //=> 객체 생성 
		//fishBun - 참조형 자료형
		
		
		fishBun.showInfo();
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽";
		fishBun.showInfo();
		
		System.out.println("==================================================");
		
		
		FishBun fishBun2 = new FishBun(); 

		fishBun2.showInfo();					//주소.하면 참조할수있다(찾아갈수있다).
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo();
		fishBun.showInfo();//위에서 넣은 자료 그대로 들고있다.
							//fishBun과 fishBun2는 다르다
		
		System.out.println(fishBun);
		System.out.println(fishBun2);
	}

}
