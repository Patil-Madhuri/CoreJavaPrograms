package pattern_23_8;

public class Pattern4 {
	public static void main(String args[])
	{
		int i;
		for( i=5; i>=1;i--)
		{
			for(int j=5;j>=i;j++)
			{
				System.out.print( j);
			}
			System.out.println();
		}
	}

}
