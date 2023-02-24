/**
 * A class describing the features of a car
 * 
 * @author sangeetha
 * @date 23-Feb-2023
 *
 */

public class Cars
{
	
	private String brand;
	private String make;
	private String bodyStyle;
	private int numberOfSeats;
	private String color;
	private boolean availibleForRent;
	private String VIN;
	
	
	/**
	 * Constructor of the class , used to create car object
	 * @param brand - brand of the car.
	 * @param make - make of the car.
	 * @param VIN - VIN of the car.
	 */
	public Cars(String brand, String make,String VIN ) {
		super();
		this.brand = brand;
		this.make = make;
		this.VIN = VIN;
		
	}
	
	
	/**
	 * Constructor of the class , used to create car object
	 * @param brand - brand of the car.
	 * @param make - make of the car.
	 * @param bodyStyle - bodyStyle of the car.
	 * @param numberOfSeats- numberOfSeats in the car.
	 * @param color- color of the car.
	 * @param availibleForRent- is car available for rental.
	 */
	public Cars(String brand, String make,String VIN, String bodyStyle, int numberOfSeats, String color,
			boolean availibleForRent) {
		super();
		this.brand = brand;
		this.make = make;
		this.VIN = VIN;
		this.bodyStyle = bodyStyle;
		this.numberOfSeats = numberOfSeats;
		this.color = color;
		this.availibleForRent = availibleForRent;
	}

	/**
	 * 
	 * @return the brand name of the car 
	 * (Toyota, Honda, Hyundai, Nissan)
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * brand - set the brand name of the car 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * 
	 * @return the make of the car like 
	 * Highlander, Civic, Sonato, PathFinder
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * make - set the make of the car
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * 
	 * @return the bodyStyle of the car like
	 *  Sedan ,SUV,Crossover,Truck
	 */
	public String getBodyStyle() {
		return bodyStyle;
	}
	
	/**
	 * bodyStyle - set the bodyStyle of the car
	 * @param bodyStyle
	 */
	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}
	
	/**
	 * 
	 * @return the number of seats in the car
	 * like 2,5,7,8
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	/**
	 * numberOfSeats - sets the number of seats
	 * @param numberOfSeats
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	/**
	 * 
	 * @return the color of car like
	 *  red,black,white 
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * color - sets the color of the car
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * 
	 * @return a boolean value whether the car is available
	 * for rent or not
	 */
	public boolean isAvailibleForRent() {
		return availibleForRent;
	}
	
	/**
	 * availibleForRent - sets a true or false 
	 * to determine if car is available or not for rent
	 * @param availibleForRent
	 */
	public void setAvailibleForRent(boolean availibleForRent) {
		this.availibleForRent = availibleForRent;
	}
	/**
	 * This method gets the VIN number of the car
	 * @return String value, the VIN of the car
	 */
	public String getVIN() {
		return VIN;
	}

	/**
	 * This method sets the VIN number of the car
	 * @param vIN - the VIN value of the car.
	 */
	public void setVIN(String vIN) {
		VIN = vIN;
	}

	
	@Override
	public String toString() {
		return "Car details: [make=" + brand + ","
				+ " model=" + make + ", "
				+ " VIN=" + VIN 
				+ " ]";
	}

}
