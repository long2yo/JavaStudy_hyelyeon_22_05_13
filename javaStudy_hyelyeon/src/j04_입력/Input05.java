package j04_입력;

import java.util.Scanner;

public class Input05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//문1
//		Scanner scanner = new Scanner(System.in);
//		
//		int a = 0;
//		int b = 0;
//		
//		System.out.println("두 수를 입력하세요: ");
//		a = scanner.nextInt();//1\n
//		b = scanner.nextInt();
//		
//		System.out.println("두 수의 합은: " + (a + b));
//	}

//문2		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("두 수의 합은: " + (a + b));
		
		System.out.println(a > b ? ">" : a < b ? "<" : "==" );//거짓인 경우에 중첩을 해서 사용하는 것이 깔끔하다
//		System.out.println(a > b ? ">" 
//						   : a < b ? "<" 
//						   : "==" );
//		a
//		+ b
//		+ c
//		+ d;
	}

}
