package introduction;

public class ReverseNo {

	public static void main(String args[])
	{
		int num = 123,rev = 0;
		while(num > 0)
		{
			 rev =rev * 10;
			 rev= num % 10 + rev;
			 num = num / 10;
			
		}
		System.out.println(rev);
		}
		
}
