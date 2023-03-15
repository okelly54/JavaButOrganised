package garage;

public class Motorbike extends Vehicle {

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

	public void blueShell() {
		System.out.println("BONK");
	}
}
