//Scores3Demo
import java.util.Scanner;
public class Scores3Demo
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
		
		Scores3 scores = new Scores3(sc1, sc2, sc3);
		
		displayData(scores); //calls method displayData for object scores
	}
	
	public static void displayData(Scores3 scrs)
	{
		System.out.println("The first score is " + scrs.getScore1()); 
		System.out.println("The second score is " + scrs.getScore2());
		System.out.println("The third score is " + scrs.getScore3());
		System.out.println("The average score is " + scrs.getAvg());
		System.out.println("Your letter grade is " + scrs.getLetterGrade());
	}
}
