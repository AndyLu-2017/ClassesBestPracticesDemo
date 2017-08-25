
public class UsedCar extends Car {
	
	private int mileage;
	
	public UsedCar(double cost, int mileage) {
		super(cost);
		this.mileage = mileage;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public boolean equals(UsedCar car2) {
		
		boolean objectsEqual;
		boolean condition1 = (this.getMileage() == car2.getMileage());
		boolean condition2 = (this.getPrice() == car2.getPrice());
		if (condition1 && condition2) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}
		return objectsEqual;
	}
	
	public String display() {
		return "price = $" + this.getPrice() + ", mileage = " + this.getMileage();
	}
}
