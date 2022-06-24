package j22_람다식;

public class Main {

	public static void main(String[] args) {
		
		Math2 m2_1 = new Math2Impl(); 
		Math2 m2_2 = new Math2() {
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}

		};
		//결과가 return 밖에 없을 때 중괄호({}) 생략
		//매개변수가 하나인 경우 괄호()생략이 가능하다.
		Math2 m2_3 = (v1, v2) -> v1 / v2;//아래와 같은 방식이다.
		
		Math2 m2_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;
			return v1 % v2;
		};
		
		double t = m2_3.calc(10, 3);
		System.out.println(t);
		
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
										//(v1, v2) -> v1 + v2; - 생성부분 /calc(10, 20) - 안에 값이 v1, v2에 대입
//		Math<Integer, Integer> plusLambda = (v1, v2) -> v1 + v2;
//		System.out.println(plusLambda.calc(10, 20));
//		
//		Math<Integer, Integer> plusLambda2 = (v1, v2) -> {
//			System.out.println("v1: " + v1);
//			System.out.println("v2: " + v2);
//			return v1 + v2;
//		};
//		System.out.println(plusLambda2.calc(30, 40));
		
		
//		Math<Integer, Double> plusLambda2 = (v1, v2) -> {
//			System.out.println("v1: " + v1);
//			System.out.println("v2: " + v2);
//			return v1 + v2;
//		};
//		System.out.println(plusLambda2.calc(30, 40.5));

	}

}
