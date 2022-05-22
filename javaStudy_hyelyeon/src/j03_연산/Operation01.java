package j03_연산;

public class Operation01 {

	public static void main(String[] args) {
		int num = 10;
		
		num = num + 1;
		//num++;
		//++num;
		
//		System.out.println(++num);//선증가 : 지금 바로 1증가(연산 먼저(증감) 이루어지고나서 출력 됨)
		System.out.println(num++);//후증가 : 지금 현재는 증가 시키지않고 그 다음 명령부터 1증가 시켜라
		                          //(출력이되고 나서 연산(증감)이 이루어진다.)
		System.out.println(num);
		
		
		System.out.println(--num);//선감소 : 지금 바로 1감소
		System.out.println(num--);//후감소 : 지금 현재는 감소 시키지않고 그 다음 명령부터 1감소 시켜라
		System.out.println(num);
		
	}

}
