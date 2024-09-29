package javaPractice;

public class CarImpl {

	public static void main(String[] args) {

		Car c1 = new Car("Car", 10, 17.3000, "Honda");

		System.out.println(c1.getBrandName());
		
		System.out.println(c1.getMileage());
		
		System.out.println(c1.getMaxSpeed());
		
		System.out.println(c1.getType());

	}

}
