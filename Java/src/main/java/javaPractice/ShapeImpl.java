package javaPractice;

public class ShapeImpl {

	public static void main(String[] args) {

		Shape circle = new Circle(4);

		double area = circle.calcuateArea();

		System.out.println(area);

		Shape rect = new Rectangle(3, 6);

		double area1 = rect.calcuateArea();

		System.out.println(area1);
		
		System.out.println(rect.calculatePerimeter());
		
		System.out.println(circle.calculatePerimeter());


	}

}
