/**
*
*/

import java.util.Scanner;

public class MontyHall
{
	public static Scanner keys = new Scanner(System.in); //declare here so all methods in class can get
	
	public static void main(String[] args)
	{
		//model the doors as ints
		int carDoor = (int) (Math.random() * 3 + 1); // Random door between 1 and 3
		int userDoor = getUserDoor();
		
		// reveal a goat
		
		System.out.println("There is a goat behind door number " + revealDoor(carDoor, userDoor));
		
		//Ask if they wanna switch doors
		boolean swap = getUserSwap(); 
		
		//TODO FINISH THIS new method
		if (swap == true)
		
		//TODO TELL IF THEY WON
		//GIT INIT
		
	}
	/**
	* Method asks user if they want to swap doors or not
	* @return Returns a boolean whether the user wants to swap or not (true to swap, false to not)
	*/
	public static boolean getUserSwap() 
	{
		System.out.println("Would you like to stay with your door or swap to the other?: ");
		String switchDoor = keys.nextLine();
		if (switchDoor.equals("yes") || switchDoor.equals("Yes"))
			return true;
		else
			return false;
	}
	/**
	* This method gets the door the user would like to secure first
	* @return The number of the door secured by the user	
	*/
	public static int getUserDoor()
	{
		System.out.println("What door would you like to secure (1-3): ");
		String firstDoor = keys.nextLine();
		return Integer.parseInt(firstDoor);
	}
	/**
	* This method calculates + returns a door for the host to reveal as a non-winning door
	* @param invalid1 A door that the host cannot open
	* @param invalid2 A door that the host cannot open (may be the same as invalid1)
	* @return The number of a door containing a goat	
	*/
	public static int revealDoor(int invalid1, int invalid2)
	{
		//Loop through all possible doors until you find a revealable one
		for (int revealDoor = 1; revealDoor < 4; revealDoor++)
		{
			if (revealDoor != invalid1 && revealDoor != invalid2)
			{
				return revealDoor;
			}
		
		}
		//Javac needs to know that you'll always return something because declared 
		//method as returning an int, and statement above doesnt guarantee return
		return -1; //only return this if above didnt work, which shouldnt happen
		
	}
	
}