public class Shirt
{
	String color;
	String brand;
	int size; //1 is small, 2 is medium, 3 is large
	
	public Shirt(String c, String b, int s)
	{
		color = c;
		brand = b;
		size = s;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getSize()
	{
		return size;
	}
}