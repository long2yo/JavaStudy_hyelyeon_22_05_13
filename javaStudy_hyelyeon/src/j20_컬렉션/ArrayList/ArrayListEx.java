package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[5];
		
		strArray[0] = "a";
		strArray[1] = "a";
		strArray[2] = "a";
		strArray[3] = "a";
		strArray[4] = "a";
		
		//값을 지우는 방법
		strArray[2] = null;
		
		//배열안에 들어있는 값을 불러오는 방법
		for(String str : strArray) {
			System.out.println(str);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		ArrayList<String> strArrayList = new ArrayList<String>();//배열과는 다르게 유동적으로 늘어난다
		strArrayList.add("b1");
		strArrayList.add("b2");
		strArrayList.add("b3");
		strArrayList.add("b4");
		strArrayList.add("b5");
		strArrayList.add("b6");
		
		System.out.println(strArrayList.size());
		
		//값을 지우는 방법 .remove()
		strArrayList.remove("b1");
		strArrayList.remove(0);//b2가 지워짐
		
		
		for(String str : strArrayList) {
			System.out.println(str);
		}
		//값을 불러오는 방법 .get()
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(strArrayList.get(i));
		}
		
		strArrayList.forEach(r -> {System.out.println(r);});
		
		
	}

}
