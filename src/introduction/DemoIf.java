package introduction;

public class DemoIf {

	public static void main(String argv[])
	{
		boolean isSat = true;
		int whichSat = 3;
		boolean isHoliday = true;
		
		if(isSat == false)
		{
			if(whichSat == 3)
			{
				if(isHoliday == false)
				{
					System.out.println("Meeting is organised");
				}
				else
				{
				System.out.println("Meeting is not organised");
				}
			}
			else
			{
			System.out.println("Meeting is not organised");
			}		
		}
		
		else
		{
		System.out.println("Meeting is not organised");
		}
	}
}
