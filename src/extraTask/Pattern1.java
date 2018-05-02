package extraTask;

public class Pattern1 {
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
				for(j=i;j<=5;j++)
				{
					if(i == 2)
					{
						break;
					}
					else
					{
					System.out.print(j);
					}
					
				}
				System.out.println();
			}
			
			
		}
}
