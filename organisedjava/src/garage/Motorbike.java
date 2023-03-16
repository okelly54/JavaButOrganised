package garage;

public class Motorbike extends Vehicle {

	public Motorbike(String name, String colour, int cost, String brand, int wheelNum, int averageSpeed) {
		super(name, colour, cost, brand, wheelNum, averageSpeed);
	}

	private String seatType;
	private String handleBars;

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getHandleBars() {
		return handleBars;
	}

	public void setHandleBars(String handleBars) {
		this.handleBars = handleBars;
	} // get and set

	public void noise() {
		this.makeNoise("brrrrr");
	}

	public void attack() {
		this.doAttack("AGGRESSIVE HONKING");
	}
}
