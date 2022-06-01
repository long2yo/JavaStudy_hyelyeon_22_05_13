package j14_추상;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//업캐스팅
		Factory samsung = new SamsungFactory();
		Factory lg = new LGFactory();
		
		
		//Factory클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성.
		Factory[] factorys = new Factory[2];
		
		
		
		factorys[0] = new SamsungFactory();//업캐스팅(SamsungFactory를 생성해서 0번 인덱스 자리에 주소 저장)
		factorys[1] = new LGFactory();//업캐스팅(LGFactory를 생성해서 1번 인덱스 자리에 주소 저장)
		
	     
		
		
		for(Factory factory : factorys) {//foreach: 처음부터 끝까지 반복
	          factory.start();			//배열안에 들어있는 모든 배열을 가동
	       
		}
	       
		for(Factory factory : factorys){
	          factory.stop();			//배열안에 들어있는 모든 배열을 멈춤
	    
		}
		
	
		
	}

}
