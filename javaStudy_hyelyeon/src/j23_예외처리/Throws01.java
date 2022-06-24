package j23_예외처리;

public class Throws01 {
	//printArray - 호출하는 곳으로 예외를 미루겠다.
	public void printArray(int[] arrays) throws Exception {
		
		for(int i = 0; i < arrays.length + 1; i++) {
			System.out.println("index" + i + ": " + arrays[i]);
		}
	}
}
