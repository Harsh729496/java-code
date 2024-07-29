package constructorExample;
public class TestAddress {
	public static void main(String[] args) {
		Address ad = new Address();
		ad.setSocityName("abc");
		ad.setPincode(77787);
		System.out.println(ad);
		Address ad1 = new Address("Shreedhar Star","Vastral",382418);
		System.out.println(ad1);
		}
}
