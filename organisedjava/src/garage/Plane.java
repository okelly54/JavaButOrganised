package garage;

public class Plane extends Vehicle {

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

	public void doA360() {
		System.out.println("DON'T PANIC WE ARE PROFESSIONALS!");
	}

}
