package pattern_23_8;

public class Pattern14 {
	public static void main(String args[])
	{
		int a=1;
		int i,j;
		for(i=1;i<=5;i++)
			{
			for(j=1;j<=5;j++)
			{
				System.out.print( a );
				if(a == 1)
				{
					a--;
				}
				else
				{
					a++;
				}
			}
			System.out.println();
			}
	}

}
