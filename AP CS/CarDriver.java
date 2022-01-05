public class CarDriver
{
	public static void main(String[] args)
	{
		Car speedy = new Car(16, true, "red");
		Car sluggo = new Car(8, false, "brown");
		Car eco = new Car(4, false, "green");
		
		System.out.println(speedy.getColor());
		
		speedy.setColor("blue");
		
		System.out.println(speedy.getColor());
	}
}