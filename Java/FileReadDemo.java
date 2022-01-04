//FileReadDemo.java
import java.io.*;
import java.util.Scanner;

public class FileReadDemo
{
	public static void main (String [] args) throws IOException
	{
		File myFile = new File("Customers.txt");
		Scanner inputFile = new Scanner(myFile);
		
		while(inputFile.hasNext())
		{
			String line = inputFile.nextLine();
			System.out.println(line);
		}
		
		inputFile.close();
	}
}