package extraTask;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[])
	{
		int num,rem,result=0,orignal;	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		num = s.nextInt();
		orignal = num;
		while(num > 0)
		{
				rem = num % 10;
				result = rem * rem * rem + result;
				num = num / 10;
			}
			if(orignal == result)
			{
			  System.out.println("No is armstrong");
			}
			else
			{
				System.out.println("NO is not armstrong");
			}
	}
}
