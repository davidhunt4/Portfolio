//FileWriteAppendDemo.java
import java.io.*;
import javax.swing.JOptionPane;

public class FileWriteAppendDemo
{
	public static void main (String [] args) throws IOException
	{
		String filename;
		filename = JOptionPane.showInputDialog("Enter the filename: ");
		
		FileWriter fwriter = new FileWriter(filename, true); //allows you to append
		PrintWriter outputFile = new PrintWriter(fwriter); //allows you to write to the file
		
		outputFile.println("Sam");
		outputFile.println("Sally");
		outputFile.println("Suzy");
		
		outputFile.close();
		System.exit(0);
	}
}