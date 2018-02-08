package vehicle; 
/**
 * Control the vehicle, whatever type it is
 * @author Nathan Bromer
 * Assignment: 04
 * Due Date: 02/08/2018
 * Course: IT2040C/ Section: 2/ Semester: Spring 2018
 */
public interface Control {

	/**
	 * Start the vehicle
	 * @return True if it's stopped, false otherwise
	 */
	Boolean start();
	/**
	 * Stop the vehicle
	 * @return True if it's started, false otherwise
	 */
	Boolean stop();

}
