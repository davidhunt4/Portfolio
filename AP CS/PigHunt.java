import java.util.*;

public class PigHunt
{
	public static void main(String[] args)
	{
		Scanner brick = new Scanner(System.in);
		
		Random generator = new Random();
		
		boolean play = true;
		
		System.out.println("Welcome to Pig!");
		
		while(play)
		{
		
			int computer = 0;
		
			int player = 0;
			
			while (true)
			{
			
				int round = 0;
		
				boolean roll = true;
			
				int x = 0;
				
				System.out.println("\n[PRESS ENTER TO START COMPUTER TURN]");
				brick.nextLine();
				
				System.out.println("****************************************");
				System.out.println("COMPUTER TURN");
				System.out.println("****************************************");
				
				while(x < 3 && roll)
				{
		
					int num = generator.nextInt(6) + 1;
			
					int num1 = generator.nextInt(6) + 1;
			
					System.out.println("\nThe computer rolled " + num + " and " + num1);
			
					if (num != 1 && num1 != 1)
					{
			
						round += (num+num1);
					
						System.out.println("Round score: " + round);
				
						if (computer + round >= 100)
						{
						
							break;
						
						}
						
						roll = true;
				
						x++;
			
					}
					else
					{
			
						round = 0;
				
						System.out.println("Round score: " + round);
				
						roll = false;
				
						if (num == 1 && num1 == 1)
						{
				
							computer = 0;
				
						}
			
					}
						
				}
		
				computer += round;
		
				System.out.println("\nComputer score: " + computer);
		
				System.out.println("Player score: " + player);
		
				if (computer >= 100)
				{
		
					System.out.println("\n****************************************");
					System.out.println("COMPUTER WINS!");
					System.out.println("****************************************");
				
					break;
				
				}
		
				round = 0;
		
				roll = true;
		
				System.out.println("\n[PRESS ENTER TO START PLAYER TURN]");
				brick.nextLine();
				
				System.out.println("****************************************");
				System.out.println("PLAYER TURN");
				System.out.println("****************************************");
		
				while(roll)
				{
		
					int num = generator.nextInt(6) + 1;
				
					int num1 = generator.nextInt(6) + 1;
			
					System.out.println("\nYou rolled " + num + " and " + num1);
			
					if (num != 1 && num1 != 1)
					{
			
						round += (num+num1);
				
						System.out.println("Round score: " + round);
				
						System.out.println("\nRoll again? y or n");
				
						if (brick.nextLine().equals("y"))
						{
				
							roll = true;
				
						}
					
						else
						{
				
							player += round;
					
							roll = false;
				
						}
			
					}
					else
					{
			
						round = 0;
					
						System.out.println("Round score: " + round);
				
						roll = false;
				
						if (num == 1 && num1 == 1)
						{
				
							player = 0;
				
						}
			
					}
		
				}
		
				System.out.println("\nComputer score: " + computer);
		
				System.out.println("Player score: " + player);
		
				if (player >= 100)
				{
		
					System.out.println("\n****************************************");
					System.out.println("PLAYER WINS!");
					System.out.println("****************************************");
			
					break;
		
				}
	
			
			}
		
			System.out.println("\nPlay again? y or n");
			
			if (brick.nextLine().equals("y"))
			{
			
				play = true;
			
			}
			else
			{
			
				play = false;
			
			}
		
		}

	}

}
