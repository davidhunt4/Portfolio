//Scores3
public class Scores3
{
	private double score1, score2, score3;
	
	public Scores3(double sc1, double sc2, double sc3)
	{
		score1 = sc1;
		score2 = sc2;
		score3 = sc3;
	}
	
	public Scores3()
	{
		score1 = 0;
		score2 = 0;
		score3 = 0;
	}
	
	public void setScore1(double sc1)
	{
		score1 = sc1;
	}
	
	public void setScore2(double sc2)
	{
		score2 = sc2;
	}
	
	public void setScore3(double sc3)
	{
		score3 = sc3;
	}
	
	public double getScore1()
	{
		return score1;
	}
	
	public double getScore2()
	{
		return score2;
	}
	
	public double getScore3()
	{
		return score3;
	}
	
	public double getAvg()
	{
		return (score1 + score2 + score3)/3.0;
	}
	
	public String getLetterGrade()
	{
		String holder;
		double avg = getAvg();
		
		if (avg < 0 || avg > 100)
			holder = "N/A";
		else
		{
			if (avg < 60)
				holder = "F";
			else if (avg < 70)
				holder = "D";
			else if (avg < 80)
				holder = "C";
			else if (avg < 90)
				holder = "B";
			else
				holder = "A";
		}
		
		return holder;
	}
}
