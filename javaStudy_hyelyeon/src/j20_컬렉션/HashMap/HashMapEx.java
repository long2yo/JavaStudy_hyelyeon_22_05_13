package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		//값 추가
//		studentMap.put(20220001, "김준일");//같은 키값에 put하면 마지막에 입력한 값이 들어가 있다.
//		studentMap.put(20220001, "김준이");
//		studentMap.put(20220001, "김준삼");
//		studentMap.put(20220001, "김준사");
//		studentMap.put(20220001, "김준오");
		
//		studentMap.put(20220001, "김준일");//키값이 다르면 중복으로 들어갈 수 있다.
//		studentMap.put(20220002, "김준이");
//		studentMap.put(20220003, "김준삼");
//		studentMap.put(20220004, "김준사");
//		studentMap.put(20220005, "김준오");
//
//		System.out.println(studentMap);
//		
//		System.out.println(studentMap.get(0));//0은 인덱스가 아니라 키 값이다.
		
		studentMap.put(20, "김준일");//키값이 다르면 중복으로 들어갈 수 있다.
		studentMap.put(10, "김준이");
		studentMap.put(22, "김준삼");
		studentMap.put(33, "김준사");
		studentMap.put(44, "김준오");

		System.out.println(studentMap);
		
		//key로 value 가져오기
		System.out.println(studentMap.get(10));
		
		//수정
		studentMap.put(10, "김준육");// key 값이 없을 경우 추가가 됨(원하는 키값이 없을 때 값이 추가)
		studentMap.replace(10, "김준철");//값이 없으면 수정할 사항이 없음
	
		studentMap.remove(10);
		
		//key값을 순회
		
		Iterator<Integer> iterable = studentMap.keySet().iterator();
		while (iterable.hasNext()) {
			Integer key = iterable.next();
			String value = studentMap.get(key);
			if(value.equals("김준오")) {
				System.out.println(studentMap.get(key));
			}
			System.out.println(value);			
		}
		
		//map은 forEach를 돌릴 수 없다 - 순서가 없기 때문
//		for() {
//			
//		}
		
		//람다식(함수형 프로그래밍) - 함수 그 자체를 값으로 넣는 것 	
		studentMap.forEach(		//void를 생략할 수 있는 이유 - return을 할 수 없기 때문
			(k, v) -> {			//함수명이 없으므로 익명 함수라고 한다.	(Map에는 key와 value가 들어있다.)				
				System.out.println("key: " + k);	//map애서 가져온 key와 value를 중괄호 안에 사용할 수 있다.	
				System.out.println("key: " + k);			
				System.out.println("value: " + v);   	
		});
		
		System.out.println(studentMap.containsKey(22)); //key값에 22 들어있는가? true
		System.out.println(studentMap.containsValue("김준구")); //value값에 "김준구"가 들어있는가? false
		
		
		
//		void test(Integer k, String v) {
//			System.out.println("key: " + k);
//			System.out.println("value: " + v);
//		}
	}

}
