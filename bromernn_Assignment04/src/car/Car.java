package car;
 
import vehicle.Vehicle;

/**
 * A Car out running the cops on the highway.
 * @author Nathan
 * Assignment: 04
 * Due Date: 02/08/2018
 * Course: IT2040C/ Section: 2/ Semester: Spring 2018
 */
public class Car extends Vehicle{

	/**
	 * If true, Car is going
	 */
	private boolean isFuseLit;

	public Car() {
		stop();
	}

	/**
	 * Is the Car moving?
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