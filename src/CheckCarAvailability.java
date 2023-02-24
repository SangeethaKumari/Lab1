import java.util.Scanner;
/**
 * 
 * A class of bag whose entries in the form of Cars
 * are stored in a chain of linked nodes.
 * @author sangeetha
 * @date 21-Feb-2023
 * 
 *
 */

public class CheckCarAvailability 
{

	public static void main(String[] args) 
	{

		//create car array object of size 12 
		Cars[] cars = new Cars[12];
		cars[0] = new Cars("Toyota", "Highlander","4Y1SL65848Z411439");
		cars[1] = new Cars("Toyota", "Prius","1B7HF16Y8TS510206");
		cars[2] = new Cars("Honda", "Pilot","5GZCZ23D13S847842");
		cars[3] = new Cars("Nissan", "PathFinder","2G1WF55EXY9103575");
		cars[4] = new Cars("Honda", "Civic","JTLKE50E191068256");
		cars[5] = new Cars("Kia", "Rio", "KM8JU3AC6DU588418");
		cars[6] = new Cars("Chevrolet","Bolt","R456KE50E191068256");
		cars[7] = new Cars("Ford", "Fusion","T546E50E191068256");
		cars[8] = new Cars("Chevrolet", "WV2YB0257EH008533","Colrado");
		cars[9] = new Cars("Ford", "Escape", "2C3CCAFJ2CH801561");
		cars[10] = new Cars("Fiat", "Fiat 500e","1B7GG23Y1NS526835");
		cars[11] = new Cars("Fiat", "Fiat 500x","4JGBF71E18A429191");

		// create an LinkedBag to add cars
		BagInterface<Cars> listOfCarsInRentalAgency = new LinkedBag<Cars>();
		
		// adding car objects to the BagInterface 
		listOfCarsInRentalAgency.add(cars[0]);
		listOfCarsInRentalAgency.add(cars[1]);
		listOfCarsInRentalAgency.add(cars[2]);
		listOfCarsInRentalAgency.add(cars[3]);
		listOfCarsInRentalAgency.add(cars[4]);
		listOfCarsInRentalAgency.add(cars[5]);
		listOfCarsInRentalAgency.add(cars[6]);
		listOfCarsInRentalAgency.add(cars[7]);
		listOfCarsInRentalAgency.add(cars[8]);
		listOfCarsInRentalAgency.add(cars[9]);
		listOfCarsInRentalAgency.add(cars[10]);
		listOfCarsInRentalAgency.add(cars[11]);
		
		System.out.println("Cars available at Rental Agency after adding 12 cars");
		System.out.println();
		printCarsInRentalAgency(listOfCarsInRentalAgency);
		
		// get the user input value to display the car details
		try (Scanner scanner = new Scanner(System.in))
		{
			System.out.print("Enter an number: ");
			int indexValue = (int)scanner.nextInt();
		
			if(indexValue <0 ||  indexValue > 11) 
			{
				System.out.println("No car is found at the entered  value: "+ indexValue);
			} else 
			{
				System.out.println("Details of car requested at entered value "+ indexValue + " is");
				Object[]  carsArray = listOfCarsInRentalAgency.toArray();
				System.out.println(carsArray[indexValue]);
			}
		}catch(Exception e) 
		{
			System.out.println("Input type mismatch, enter a proper integer value");
		}
		
	}
	
	
	/**
	 * This method prints the details of 
	 * cars available at the rental Agency
	 * 
	 * @param listOfCarsInRentalAgency
	 */

	private static void printCarsInRentalAgency(BagInterface<Cars> listOfCarsInRentalAgency) 
	{
		
		for(int i =0;i<listOfCarsInRentalAgency.getCurrentSize();i++){
			Object[]  car = listOfCarsInRentalAgency.toArray();
			System.out.println(i + " "+car[i]);
		}
	}

}
