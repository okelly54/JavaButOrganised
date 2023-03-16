package garage;

// derived class
public class Car extends Vehicle {

	public Car(String name, String colour, int cost, String brand, int wheelNum, int averageSpeed) {
		super(name, colour, cost, brand, wheelNum, averageSpeed);
	}

	private int height;
	private boolean seatWarmer;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isSeatWarmer() {
		return seatWarmer;
	}

	public void setSeatWarmer(boolean seatWarmer) {
		this.seatWarmer = seatWarmer;
	} // get and set

	public void noise() {
		this.makeNoise("HONK HONK OUT THE ROAD");
	}

	public void attack() {
		this.doAttack("BLUE SHELL INCOMING - B O N K!");
	}

}
