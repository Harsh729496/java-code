package constructorExample;

public class TestEmployee {
	public static void main(String[] args) {
		EmployeeConstructor em = new EmployeeConstructor();
		em.setName("Dharm");
		em.setId(01);
		System.out.println(em);
		EmployeeConstructor em1 = new EmployeeConstructor("Dharm","adc@gamil.com",01);
		System.out.println(em1);
	}
}
