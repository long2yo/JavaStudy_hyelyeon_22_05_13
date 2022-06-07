package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.Entity.Student;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		
		//값을 추가할때 .add		
		//set - 순서도 없으며, 값의 중복을 허용하지 않는다.
		//set은 인덱스 번호가 없다.
		//set은 수정할 수 없다. - 그 자체로 고유한 값이기 때문에 수정하기 위해서는 삭제하고 추가해야한다.
		name.add("김준일");
		name.add("김준이");
		name.add("김준삼");
		name.add("김준사");
		name.add("김준일");
		name.add("김준일");

		System.out.println(name);
		
		//iterator - 줄을 세운다 -> 위에서 부터 하나씩 값을 가져온다.
		Iterator<String> iterator = name.iterator(); //name.iterator(); - 주소 값 -> iterator에 주소를 담는다(한번쓰고나면 소모됨)
		while(iterator.hasNext()) {		//.hasNext()-다음 값이 있니?(true/false 리턴해줌)			
			String name2 = iterator.next(); //iterator.next(); - 값을 하나씩 가져옴
			if(name2.equals("김준이")) {
				System.out.println(name2);
			}
		}
		
		name.remove("김준사");//.remove() - 값을 지워라
		System.out.println(name);
		
		//값 수정
//		name.remove
		

		

		
	}
}
