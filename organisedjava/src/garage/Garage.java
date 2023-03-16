package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	public void add(Vehicle v) {
		this.vehicles.add(v);
	}

	public void remove(Vehicle v) {
		this.vehicles.remove(v);
	}
	// need to remove by id or type

	public void removeType(Vehicle v) {
		for (Vehicle i : this.vehicles) {
			if (i instanceof Car)
				this.vehicles.remove(i);
			else if (i instanceof Plane)
				this.vehicles.remove(i);
			else if (i instanceof Motorbike)
				this.vehicles.remove(i);
			else
				System.out.println("Error");
		}
	}

	public int bill() {
		int cost = 0;
		for (Vehicle v : this.vehicles) {
			if (v instanceof Car)
				cost += 2000;
			else if (v instanceof Plane)
				cost += 50000;
			else if (v instanceof Motorbike)
				cost += 1000;
			else
				System.out.println("Error");
		}
		return cost;
	} // bill

}
