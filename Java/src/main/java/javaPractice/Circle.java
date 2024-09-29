package javaPractice;

public class Circle implements Shape {

	private float radius;

	public Circle(float radius) {	
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public double calcuateArea() {
		return 3.14*radius*radius;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*3.14*radius;
	}




}
