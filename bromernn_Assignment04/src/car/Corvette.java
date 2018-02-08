package car;
 
/**
 * A new custom ordered Corvette
 * @author Nathan Bromer
 *  Assignment: 04
 * Due Date: 02/08/2018
 * Course: IT2040C/ Section: 2/ Semester: Spring 2018
 */
public class Corvette extends Car{
	
	private String color;
	private int horsePower;
	private int speed;
	private String gearBox;
	
	/**
	 * Custom Corvette
	 * @param color = the car's color
	 * @param horsePower = total horsepower
	 * @param speed = speed(4-6)
	 * @param gearBox = manual or automatic
	 */
	public Corvette(String color, int horsePower, int speed, String gearBox) {
		setColor(color);
		setHorsePower(horsePower);
		setSpeed(speed);
		setGearBox(gearBox);
	}
	
	public String toString() {
		return "Corvette Color: " + getColor() + 
				" Speed: " + getSpeed() + 
				" Manual or Automatic?: " + getGearBox() + 
				" Total Horse Power: " + getHorsePower();
	}
	
	/**
	 * get and set color of corvette
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * get and set horse power of corvette
	 * @return horse power
	 */
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	/**
	 * get and set corvette speed
	 * @return speed
	 */
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/**
	 * get and set gear box for corvette
	 * @return gear box
	 */
	public String getGearBox() {
		return gearBox;
	}
	public void setGearBox(String gearbox) {
		this.gearBox = gearbox;
	}
	

}
