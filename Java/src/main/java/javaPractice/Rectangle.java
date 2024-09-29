package javaPractice;

public class Rectangle implements Shape{

	private float length;

	private float width;

	public Rectangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public double calcuateArea() {
		return length * width;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(length+width);
	}





}
