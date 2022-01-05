import java.util.Scanner;
public class PascalTriangle
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Which row would you like printed?");
		
		int row = keyboard.nextInt();
		
		printArray(makeRow(row));
	}
	
	public static int[] makeRow(int n)
	{
		if(n > 2)
		{
			int[] current = new int[n];
			
			int[] previous = makeRow(n-1);
			
			for(int i = 0; i <= n-1; i++)
			{
				if (i == 0 || i == n-1)
					current[i] = 1;
				else
					current[i] = previous[i] + previous[i-1];
			}
			
			return current;
		}
		else
		{
			int[] array = new int[]{1, 1};
			return array;
		}
	}
	
	public static void printArray(int[] a)
	{
		for(int x = 0; x < a.length; x++)
		{
			System.out.print(a[x] + "   ");
		}
		System.out.println();
	}
}

