public class Fibo
{
	public static void main(String[] args)
	{
		for(int i = 1; i < 20; i++)
		{
			System.out.println(findFibo(i) + "   ");
		}
	}
	
	public static int findFibo(int n)
	{
		if (n==1 || n==2)
			return 1;
		else
		{
			return findFibo(n-2) + findFibo(n-1);
		}
	}
}