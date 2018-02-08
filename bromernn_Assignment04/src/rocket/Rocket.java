package rocket; 

import vehicle.Vehicle;

/**
 * A SpaceX passenger rocket on the launch pad
 * @author Nathan Bromer
 * Assignment: 04
 * Due Date: 02/08/2018
 * Course: IT2040C/ Section: 2/ Semester: Spring 2018
 */
public class Rocket extends Vehicle {

	/**
	 * If true, Rocket is going
	 */
	private boolean isFuseLit;

	public Rocket() {
		stop();
	}

	/**
	 * Is the Rocket moving?
	 * @return True if it's moving, false otherwise
	 */
	public boolean isGoing() {
		return isFuseLit;
	}

	@Override
	public Boolean start() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean stop() {
		// TODO Auto-generated method stub
		return null;
	}


}
