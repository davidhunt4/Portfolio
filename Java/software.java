//Software.java
public class Software
{
	private short unitsSold;
	
	public Software(short units)
	{
		unitsSold = units;
	}
	
	public Software()
	{
		unitsSold = 0;
	}
	
	public void setUnitsSold(short units)
	{
		unitsSold = units;
	}
	
	public short getUnitsSold()
	{
		return unitsSold;
	}
	
	public double getPurPrice()
	{
		double price;
		
		if (unitsSold >= 100)
			price = 99-(0.5*99);
		else if (unitsSold >= 50)
			price = 99-(0.4*99);
		else if (unitsSold >= 20)
			price = 99-(0.3*99);
		else if (unitsSold >= 10)
			price = 99-(0.2*99);
		else
			price = 99;
	
		return price;
	}
	
	public double getBalDue()
	{
		return unitsSold*getPurPrice();
	}
}
