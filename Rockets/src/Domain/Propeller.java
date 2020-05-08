package Domain;

import java.util.*;

public class Propeller {

	private int currentAcceleration;

	private int maxAcceleration;

	public Propeller(int maxAcceleration) {

		this.maxAcceleration = maxAcceleration;

	}

	public void refreshAcceleration(int newAcceleration) { // controlar menys del maxim i mes de 0

		this.currentAcceleration = newAcceleration;
	}
}
