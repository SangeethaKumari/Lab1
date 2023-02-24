import java.util.ArrayList;

/**
 * A car that maintains details of cars for the rental agency
 * @author sangeetha
 *
 */

public class OnlineCarRentalShopping {
	
	public static void main(String[] args) {
		
		Cars[] cars = new Cars[10];
		cars[0] = new Cars("Toyota", "Highlander","4Y1SL65848Z411439", "SUV", 8, "Black", false);
		cars[1] = new Cars("Toyota", "Prius","1B7HF16Y8TS510206", "Sedan", 5, " Blue", true);
		cars[2] = new Cars("Honda", "Pilot","5GZCZ23D13S847842", "SUV", 8, "White", false);
		cars[3] = new Cars("Nissan", "PathFinder","2G1WF55EXY9103575", "SUV", 8, " Forest green", true);
		cars[4] = new Cars("Honda", "Civic","JTLKE50E191068256", "Sedan", 5, " Silver", true);
		cars[5] = new Cars("Kia", "Rio", "KM8JU3AC6DU588418","Sedan", 5, " Red", true);
		cars[6] = new Cars("Chevrolet","R456KE50E191068256", "Bolt", "Sedan", 5, " Red", true);
		cars[7] = new Cars("Ford", "Fusion","T546E50E191068256", "Sedan", 5, " Red", true);
		cars[8] = new Cars("Chevrolet", "WV2YB0257EH008533","Colrado", "truck", 4, " Red", true);
		cars[9] = new Cars("Ford", "Escape", "2C3CCAFJ2CH801561","Crossover", 5, " Silver", true);
		
		
		//create an arraylist to add cars
		ArrayList<Cars> listOfCarsInRentalAgency = new ArrayList<Cars>();
		
		listOfCarsInRentalAgency.add(cars[0]);
		listOfCarsInRentalAgency.add(cars[1]);
		listOfCarsInRentalAgency.add(cars[2]);
		listOfCarsInRentalAgency.add(cars[3]);
		listOfCarsInRentalAgency.add(cars[4]);
		listOfCarsInRentalAgency.add(cars[5]);
		

		
		System.out.println("Cars available at Rental Agency after adding six cars");
		printCarsInRentalAgency(listOfCarsInRentalAgency);
		
		System.out.println();
		
		// setting the index value at which the car object is to be removed. 
		int carIndextoBeRemoved = 0;
		//remove the car object from the list
		removeCar(carIndextoBeRemoved,listOfCarsInRentalAgency);
		carIndextoBeRemoved = 1;
		removeCar(carIndextoBeRemoved,listOfCarsInRentalAgency);

		System.out.println("Cars available at Rental Agency after removing first two cars");
		printCarsInRentalAgency(listOfCarsInRentalAgency);
		
		System.out.println();
		System.out.println("Cars available at Rental Agency after adding four new cars");
		listOfCarsInRentalAgency.add(cars[6]);
		listOfCarsInRentalAgency.add(cars[7]);
		listOfCarsInRentalAgency.add(cars[8]);
		listOfCarsInRentalAgency.add(cars[9]);

		printCarsInRentalAgency(listOfCarsInRentalAgency);
	
	}
	/**
	 * This methods checks whether the list is empty or not and removes the car object at
	 * the given index value
	 * @param carIndextoBeRemoved - the index value for removing the car from list
	 * @param listOfCarsInRentalAgency - list of cars
	 */
	private static void removeCar(int carIndexToBeRemoved, ArrayList<Cars> listOfCarsInRentalAgency) {

		if(!listOfCarsInRentalAgency.isEmpty() && 
				(carIndexToBeRemoved>=0 && carIndexToBeRemoved<listOfCarsInRentalAgency.size())) {
			listOfCarsInRentalAgency.remove(carIndexToBeRemoved);
		}
		
	}
	/**
	 * This method prints the details of 
	 * cars available at the rental Agency
	 * 
	 * @param listOfCarsInRentalAgency
	 */

	private static void printCarsInRentalAgency(ArrayList<Cars> listOfCarsInRentalAgency) {
		
		for(Cars car : listOfCarsInRentalAgency){
			System.out.println(car);
		}
	}
	

}
