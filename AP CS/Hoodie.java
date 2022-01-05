public class Hoodie extends Shirt
{
	boolean strings, pockets;
	
	public Hoodie(String c, String b, int s, boolean st, boolean p)
	{
		super(c, b, s);
		strings = st;
		pockets = p;
	}
	
	public boolean getStrings()
	{
		return strings;
	}
	
	public boolean getPockets()
	{
		return pockets;
	}
	
	public void setStrings(boolean st)
	{
		strings = st;
	}
	
	public void setPockets(boolean p)
	{
		pockets = p;
	}
}
