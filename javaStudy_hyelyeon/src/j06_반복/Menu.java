package j06_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		
//		int i = 0;
//		while(true) {
//			if(i == 10) {
//				break;//while문에는 break가 꼭 있어야 된다.
//			}
//			i++;
//		}
		
		while(loopFlag) {
			char select = 0;
			
			System.out.println("[메뉴 선택]");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("4. 프로그램 종료");			
			
			System.out.print("명령을 입력하세요: ");
			select = scanner.next().charAt(0);//a b c
			String str = scanner.nextLine();//버퍼를 날려준다
			
//			System.out.println(select);
//			System.out.println(str);
			
			if(select == 'q') {
				break;
			}else if(select == '1') {
				System.out.println("java를 선택하셨습니다.");
//				System.out.println("계속하시려면 엔터를 눌러주세요.");
//				scanner.nextLine();
				while(true) {
					System.out.println("[java 메뉴]");
					System.out.println("1. java란?");
					System.out.println("b. 뒤로가기");
					
					System.out.println("명령을 입력하세요: ");
					select = scanner.nextLine().charAt(0);
//					select = scanner.next().charAt(0);
//					scanner.nextLine();
					
					if(select =='b') {
							break;
					}else if(select == 'q') {
						loopFlag =false;
							break;
					}else if(select == '1') {
		                  System.out.println("자바란~~~입니다.");
		                  System.out.println("계속하시려면 엔터를 눌러주세요.");
		                  scanner.nextLine();
		                  
		               }else {
		                  System.out.println("해당 명령은 보기에 없습니다.");
		                  System.out.println("다시 입력하세요.");
		                  
		               }
					
		                  System.out.println();
				}
				
			}else if(select == '2') {
				System.out.println("python를 선택하셨습니다.");
//				System.out.println("계속하시려면 엔터를 눌러주세요.");
//				scanner.nextLine();
				while(true) {
					System.out.println("[python 메뉴]");
					System.out.println("1. python란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					
					System.out.println("명령을 입력하세요: ");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						System.out.println("python란~~~입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
						
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
					
					System.out.println();
				}
				
			}else if(select == '3') {
				System.out.println("javascript를 선택하셨습니다.");
//				System.out.println("계속하시려면 엔터를 눌러주세요.");
//				scanner.nextLine();
				while(true) {
					System.out.println("[javascript 메뉴]");
					System.out.println("1. javascript란?");
					System.out.println("b. 뒤로가기");
					
					System.out.println("명령을 입력하세요: ");
					select = scanner.nextLine().charAt(0);
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						System.out.println("javascript란~~~입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
					System.out.println();
				}
				
			}else {
				System.out.println("해당 명령은 보기에 없습니다.");
	            System.out.println("다시 입력하세요");
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}

}
