package j22_람다식;

@FunctionalInterface
public interface Math <T1, T2> {
//	public int calc(T1 value1, T2 value);
	public Double calc(T1 value1, T2 value);
}
