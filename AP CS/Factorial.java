//Factorial.java
import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		int num;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = keyboard.nextInt();
		System.out.println("The factorial of " + num + " is " + findFact(num));
	}
	
	public static int findFact(int n)
	{
		if (n == 1)
			return 1;
		else
			return n * findFact(n-1);
	}
}