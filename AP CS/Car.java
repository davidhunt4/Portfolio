public class Car
{
	private int numberCylinders;
	private boolean sportsCar;
	private String color;
	
	public Car(int n, boolean s, String c)
	{
		numberCylinders = n;
		sportsCar = s;
		color = c;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String c)
	{
		color = c;
	}
	
	public int getCylinders()
	{
		return numberCylinders;
	}
	
	public void setCylinders(int n)
	{
		numberCylinders = n;
	}
	
	public boolean getSports()
	{
		return sportsCar;
	}
	
	public boolean setSports(boolean s)
	{
		sportsCar = s;
	}
}