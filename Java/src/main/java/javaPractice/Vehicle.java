package javaPractice;

public class Vehicle {

	private String type;

	private long maxSpeed;

	private double mileage;

	public Vehicle() {
		super();
	}

	public Vehicle(String type, long maxSpeed, double mileage) {
		super();
		this.type = type;
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(long maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}



}
