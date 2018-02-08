package bicycle;
 
import vehicle.Vehicle;

/**
 * A bicycle racing in the Tour de France
 * @author Nathan Bromer
 * Assignment: 04
 * Due Date: 02/08/2018
 * Course: IT2040C/ Section: 2/ Semester: Spring 2018
 */
public class Bicycle extends Vehicle {

	/**
	 * If true, bicycle is going
	 */
	private boolean isPedaling;

	public Bicycle() {
		stop();
	}

	/**
	 * Is the Bicycle moving?
	 * @return True if it's moving, false otherwise
	 */
	public boolean isGoing() {
		return isPedaling;
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
