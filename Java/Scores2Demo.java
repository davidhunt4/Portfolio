//scores2Demo
import java.util.Scanner;
public class Scores2Demo
{
	public static void main (String [] args)
	{
		double sc1, sc2, sc3;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the first score: ");
		sc1 = keyboard.nextDouble();
		System.out.print("Enter the second score: ");
		sc2 = keyboard.nextDouble();
		System.out.print("Enter the third score: ");
		sc3 = keyboard.nextDouble();
		
		Scores2 scores = new Scores2(sc1, sc2, sc3);
		
		displayData(scores);
	}
	
	public static void displayData(Scores2 scrs)
	{
		System.out.println("The first score is " + scrs.getScore1());
		System.out.println("The second score is " + scrs.getScore2());
		System.out.println("The third score is " + scrs.getScore3());
		System.out.println("The average score is " + scrs.getAvg());
	}
}
