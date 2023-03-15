package garage;

public class Vehicle {

	private String name;
	private String colour;
	private String brand;
	private int wheelNum;
	private int averageSpeed;
	// instance variables - when public?

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWheelNum() {
		return wheelNum;
	}

	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}

	public int getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(int averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	// get set

	public Vehicle(String name, String colour, String brand, int wheelNum, int averageSpeed) {
		this.name = name;
		this.colour = colour;
		this.brand = brand;
		this.wheelNum = wheelNum;
		this.averageSpeed = averageSpeed;
	} // global variables

}
