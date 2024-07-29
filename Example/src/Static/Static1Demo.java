package Static;

public class Static1Demo {

	public static void main(String[] args) {
		
		Static1 s1 = new Static1();
		System.out.println(Static1.cnt +""+ s1);
		Static1 s2 = new Static1();
		System.out.println(Static1.cnt +""+ s2);
		Static1 s3 = new Static1();
		System.out.println(Static1.cnt +""+ s3);
		s3.getDate();
	}

}
