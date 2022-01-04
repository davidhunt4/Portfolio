//FileWriteDemo.java
import java.util.Scanner;
import java.io.*;

public class FileWriteDemo
{
	public static void main (String [] args) throws IOException
	{
		PrintWriter outputFile = new PrintWriter("sample.txt");
		
		outputFile.println("John");
		outputFile.println("Jack");
		outputFile.println("Joe");
		
		outputFile.close();
	}
}
