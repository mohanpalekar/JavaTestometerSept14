package javaPractice;

public class Car extends Vehicle{

	private String brandName;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Car(String type, long maxSpeed, double mileage, String brandName) {
		super(type,  maxSpeed,  mileage);
		this.brandName = brandName;
	}

}
