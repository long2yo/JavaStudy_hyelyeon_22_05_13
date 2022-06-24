package j22_람다식;

//람다는 메소드가 무조건 하나여야한다.
//람다는 무조건 @FunctionalInterface를  해줘야한다.
@FunctionalInterface
public interface Math2 {
	public double calc(double value1, double value2);

}
