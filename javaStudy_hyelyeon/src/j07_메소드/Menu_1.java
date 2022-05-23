package j07_메소드;

import java.util.Scanner;

public class Menu_1 {
	
	public static void program() {
	System.out.println("[메뉴 선택]");
	System.out.println("1. java");
	System.out.println("2. python");
	System.out.println("3. javascript");
	System.out.println("4. 프로그램 종료");			
	
	System.out.print("명령을 입력하세요: ");
	}
	
	public static void program1(String name) {
		System.out.println(name + "를 선택하셨습니다.");
	}
	
	public static void program2(String name) {
		System.out.println("[ " + name + "메뉴]");
		System.out.println("1. " + name + "란?");
		System.out.println("b. 뒤로가기");
		
		System.out.println("명령을 입력하세요: ");
	}	
	
	public static void program3(String name) {
        System.out.println(name + "란~~~입니다.");
        System.out.println("계속하시려면 엔터를 눌러주세요.");
	}
	public static void program4() {
		System.out.println("해당 명령은 보기에 없습니다.");
		System.out.println("다시 입력하세요.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		

		
		while(loopFlag) {
			char select = 0;
			
			program();
			select = scanner.next().charAt(0);//a b c
			String str = scanner.nextLine();//버퍼를 날려준다
			
//			System.out.println(select);
//			System.out.println(str);
			
			if(select == 'q') {
				break;
			}else if(select == '1') {
				program1("java");

				while(true) {
					program2("java");
					select = scanner.nextLine().charAt(0);

					
					if(select =='b') {
							break;
					}else if(select == 'q') {
						loopFlag =false;
							break;
					}else if(select == '1') {
						program3("java");
		                  scanner.nextLine();
		                  
		               }else {
		            	   program4();
		               }
					
		                  System.out.println();
				}
				
			}else if(select == '2') {
				program1("python");
//				System.out.println("계속하시려면 엔터를 눌러주세요.");
//				scanner.nextLine();
				while(true) {
					program2("python");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						program3("python");
						scanner.nextLine();
						
					}else {
						program4();
					}
					
					System.out.println();
				}
				
			}else if(select == '3') {
				program1("javascript");
//				System.out.println("계속하시려면 엔터를 눌러주세요.");
//				scanner.nextLine();
				while(true) {
					program2("javascript");
					select = scanner.nextLine().charAt(0);
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						program3("javascript");
						scanner.nextLine();
					}else {
						program4();
					}
					System.out.println();
				}
				
			}else {
				program4();
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}
}


