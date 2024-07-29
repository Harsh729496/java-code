package Static;

public class Static1 {
	static String msg = "Let us start coding";
	static int cnt = 1;
	int i=0;
	public Static1() {
		i++;
		cnt++;
	}
	public static void getDate() {
		System.out.println(cnt);
	}
	@Override
	public String toString() {
		return "Static1 [i=" + i + "]";
	}
}
