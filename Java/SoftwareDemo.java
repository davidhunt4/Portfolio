//SoftwareDemo.java
import java.util.Scanner;
public class SoftwareDemo
{
	public static void main (String [] args)
	{
		short units;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many software units sold? ");
		units = keyboard.nextShort();
		
		if (units > 0)
		{
			Software box = new Software(units);
		
			System.out.printf("Units sold:%49d\n", box.getUnitsSold());
			System.out.printf("Price per unit:%36s%9.2f\n", "$", box.getPurPrice()); //I just put in dollar sign literal
			System.out.printf("Balance due:%39s%9.2f\n", "$", box.getBalDue());
		}
		else
			System.out.println("Bad data. Restart the program.");
	}
}
