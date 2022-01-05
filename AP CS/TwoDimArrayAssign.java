public class TwoDimArrayAssign
{

	public static void main(String[] args)
	{
		// use the array below as the input array for the methods you write 
		int[][] myArray = {{1,3,5,7}, {2,4,6,8}, {1,2,5,7}, {6,5,2,1}, {6,7,8,9}}; // 5 rows and 4 columns
		
		// Illustrate the functionality of your methods by calling them and doing appropriate printouts. 
		// This should be here inside the main method.
		// I provided a method to print out the contents of an array.
		printArray1D(findElement(myArray, 3));
		
		System.out.println();
		
		printArray1D(rowSums(myArray));
		
		System.out.println();
		
		printArray(myArray);
		
		System.out.println();
		
		printArray1D(colSums(myArray));
		
		System.out.println();
		
		printArray1D(sumOddCols(myArray));
		
		System.out.println();
		
		printArray(copy(myArray));
	}

	/* Write a method that takes a two-dimensional array of integers and
	a value as input and then returns the index of the item. Name the method findElement().
	*/
	
	public static int[] findElement(int[][] a, int e)
	{
		int[] index = new int[2];
		
		for(int x = 0; x < a.length; x++)
		{
			for(int y = 0; y < a[x].length; y++)
			{
				if (a[x][y] == e)
				{
					index[0] = x;
					index[1] = y;
					break;
				}
			}
		}
		
		return index;
	}

	/* Write a method that takes a two-dimensional array of integers
	as input and returns a one-dimensional array of integers containing the row sums. Name the method rowSums().
	*/
	
	
	public static int[] rowSums(int[][] a)
	{
		int[] sums = new int[a.length];
		
		for(int x = 0; x < a.length; x++)
		{
			for(int y = 0; y < a[x].length; y++)
			{
				sums[x] += a[x][y];
			}
		}
		
		return sums;
	}
	
	/* Write a method that takes a two-dimensional array of integers
	as input and returns a one-dimensional array of integers containing the column sums. Name the method colSums().
	*/
	
	
	public static int[] colSums(int[][] a)
	{
		int[] sums = new int[a[0].length];
		
		for(int x = 0; x < a.length; x++)
		{
			for(int y = 0; y < a[x].length; y++)
			{
				sums[y] += a[x][y];
			}
		}
		
		return sums;
	}
	
	/* Write a method that takes a two-dimensional array of integers
	as input and returns a one-dimensional array of integers containing the odd-numbered column sums.
	Name the method sumOddCols().
	*/
	
	public static int[] sumOddCols(int[][] a)
	{
		int[] sums = new int[(a[0].length/2) + (a[0].length % 2)];
		
		for(int x = 0; x < a.length; x++)
		{
			for(int y = 0; y < sums.length; y ++)
			{
				sums[y] += a[x][y*2]; 
			}
		}
		
		return sums;
	}
	
	/* Write a method that takes a two-dimensional array of integers as
	input and copies the values into a new two-dimensional array and returns the new array. 
	Name the method copy().
	*/
	
	public static int[][] copy(int[][] a)
	{
		int[][] duplicate = new int[a.length][a[0].length];
		
		for(int x = 0; x < a.length; x++)
		{
			for(int y = 0; y < a[x].length; y++)
			{
				duplicate[x][y] = a[x][y];
			}
		}
		
		return duplicate;
	}

	public static void printArray(int[][] someArray)
	{
		for(int i = 0; i < someArray.length; i++)
		{
			for(int j = 0; j < someArray[0].length; j++)
			{
				System.out.print(someArray[i][j] + "   ");
			}
			System.out.println();
		}
	}
	
	public static void printArray1D(int[] a)
	{
		for(int x = 0; x < a.length; x++)
		{
			System.out.print(a[x] + "   ");
		}
		System.out.println();
	}


}
