package j06_반복;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//continue
//continue를 만나면 여기까지만 실행하고 다음으로 넘어간다.
//continue랑 같은 공간안에 있는 아래에 코드는 실행되지 않는다.		
		for(int i = 0; i < 10; i++ ) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
//위치 변경할 경우 단축키
//변경할거 드래그해서 alt + 방향키	
		
		for(int i = 0; i < 10; i++ ) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
