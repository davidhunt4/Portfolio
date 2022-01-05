public class ShirtDriver
{
	public static void main(String[] args)
	{
		Shirt coolShirt = new Shirt("white", "Champion", 3);
		
		Hoodie coolHoodie = new Hoodie("gray", "Nike", 3, true, true);
		
		System.out.println("The brand of the shirt is " + coolShirt.getBrand());
		System.out.println("The color of the hoodie is " + coolHoodie.getColor());
	}
}