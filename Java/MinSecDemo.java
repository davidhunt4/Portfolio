//MinSecDemo.java
public class MinSecDemo
{
	public static void main (String [] args)
	{
		for(int min = 0; min < 60; min++)
		{
			for (int sec = 0; sec < 60; sec++)
				System.out.println(min + ":" + sec);
		}
	}
}