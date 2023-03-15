package garage;

// derived class
public class Car extends Vehicle {

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

	public void honk() {
		System.out.println("HONK HONK GET OUT THE ROAD");
	}

}
