package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {		
		//주석
		/*
		 * 메모, 필기
		 * 
		 * 1.문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름: 김땡땡
		 * 나이: 29
		 * 연락처: 010-1234-5678
		 * 주소: 부산 동래구 땡땡땡
		 */
		
		  char name1 = '김';
		  char name2 = '땡';
		  char name3 = '땡';
		  int age = 29;
		  String phone = "010-1234-5678";
		  String address = "부산 동래구 땡땡동";
		  
		  
		  //방법1
		  System.out.println("이름: " + name1 + name2 + name3);
		  System.out.println("나이: " + age);
		  System.out.println("연락처: " + phone);
		  System.out.println("주소: " + address);
		  
		  System.out.println("---------------------------------");
		  
		  //방법2
		  System.out.print("이름: ");
		  System.out.print(name1);
		  System.out.print(name2);
		  System.out.println(name3);
		  System.out.print("나이: ");
		  System.out.println(age);
		  System.out.print("연락처: ");
		  System.out.println(phone);
		  System.out.print("주소: ");
		  System.out.println(address);
		  
		  System.out.println("----------------------------------");
		  
		  System.out.print("이름: ");
		  System.out.println("" + name1 + name2 + name3); //16진수 AC01 -> 10
		     				//문자열이랑 문자랑 더하면 문자열이 된다.
		  
		  System.out.println("세수의 합: " + 10 + 20 + 30); //더해지는 것이 아니라 
		  													//문자열과 문자랑 더하여 문자열이 되어서 나열된다
		 
		   
		  System.out.println("세수의 합: " + (10 + 20 + 30)); //()로 우선순위를 먼저 하고 합해라
				  
				  
		
		
		
	}

}
