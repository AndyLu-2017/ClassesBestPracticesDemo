
public class NewCar extends Car {
	
	private String color;
	
	public NewCar(double cost, String color) {
		super(cost);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean equals(NewCar car2) {
		
		boolean objectsEqual;
		boolean condition1 = this.getColor().equals(car2.getColor());
		boolean condition2 = (this.getPrice() == car2.getPrice());
		if (condition1 && condition2) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}
		return objectsEqual;
	}
	
	public String display() {
		return "price = $" + this.getPrice() + ", color = " + this.getColor();
	}
}
