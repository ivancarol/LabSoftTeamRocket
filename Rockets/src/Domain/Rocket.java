package Domain;

import java.util.*;

public class Rocket {

	private String name;
	private ArrayList<Propeller> propellers;
	private float currentPos;
	private float currentSpeed;
	private FuelTank fuelTank;

	public Rocket(String name) {

		this.name = name;
		this.propellers = new ArrayList<Propeller>();

	}

	public void addProppeller(Propeller propeller) {

		this.propellers.add(propeller);
		
	}

	public void addFuelTank(FuelTank fuelTank) {

		this.fuelTank = fuelTank;

	}

}
