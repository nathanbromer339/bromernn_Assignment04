package skateboard; 

import vehicle.Vehicle;

/**
 * A skateboard at a skatepark, making a YouTube video
 * @author Nathan Bromer
 * Assignment: 04
 * Due Date: 02/08/2018
 * Course: IT2040C/ Section: 2/ Semester: Spring 2018
 */
public class Skateboard extends Vehicle {

	/**
	 * If true, Skateboard is going
	 */
	private boolean isRolling;

/*	public Skateboard Skateboard() { //This seems unnecessary, doesn't want to compile.
		stop();
	}
*/
	/**
	 * Is the Skateboard moving?
	 * @return True if it's moving, false otherwise
	 */
	public boolean isGoing() {
		return isRolling;
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
