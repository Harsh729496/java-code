package Program;

public class Circle {
	private double r;
	private final float pi=3.14f;
	
	public Circle() {
		this.r=3.4;
	}
	
	public double getArea() {
		return pi*r*r;
	}
}