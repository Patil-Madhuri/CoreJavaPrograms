package arrays;

import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);			
		System.out.println("Enter elements");
		for(int i=0; i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("multiple of 5");
		for(int i=0; i<a.length; i++)
		{
			if(a[i] % 5 == 0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
