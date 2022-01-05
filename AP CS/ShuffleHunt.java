import java.util.*;
public class ShuffleHunt
{
	public static void main(String[] args)
	{
		int[] myArray = {1,2,3,4,5,6,7,8,9};
		Random generator = new Random();
		
		ArrayList<Integer> values = new ArrayList<>();
		
		for(int x = 0; x < myArray.length; x++)
		{
			values.add(myArray[x]);
		}
		
		for(int x = 0; x < myArray.length; x++)
		{
			
			int rand = generator.nextInt(values.size());
			myArray[x] = values.get(rand);
			values.remove(rand);
		}
		
		printArray(myArray);
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