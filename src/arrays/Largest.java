package arrays;

import java.util.Scanner;

public class Largest 
{
	public static void main(String[] args) 
	{
		int large = 0,i;
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);			
		System.out.println("Enter elements");
		for( i=0; i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		a[0] = large;
		for( i=0; i<a.length; i++)
		{
			if(large < a[i]   )
			{
				large = a[i];
			}
		}
		System.out.println("Largest Element: " +large);
	}
}
