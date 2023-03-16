package garage;

public class Plane extends Vehicle {

	public Plane(String name, String colour, int cost, String brand, int wheelNum, int averageSpeed) {
		super(name, colour, cost, brand, wheelNum, averageSpeed);
	}

	private int wingType;
	private String engineType;

	public int getWingType() {
		return wingType;
	}

	public void setWingType(int wingType) {
		this.wingType = wingType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	} // get and set

	public void noise() {
		this.makeNoise("DON'T PANIC WE ARE PROFESSIONALS!");
	}

	public void attack() {
		this.doAttack("360");
	}

}
