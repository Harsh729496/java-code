package constructorExample;

public class EmployeeConstructor {
	String name,mail;
	int id;
	
	public EmployeeConstructor(){
		this.id=1;
		this.name="Dharm";
		this.mail="adc24533@gamil.com";	
	}
	
	public EmployeeConstructor(String name, String mail, int id) {
		super();
		this.name = name;
		this.mail = mail;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "EmployeeConstructor [name=" + name + ", mail=" + mail + ", id=" + id + "]";
	}
	
	
}
