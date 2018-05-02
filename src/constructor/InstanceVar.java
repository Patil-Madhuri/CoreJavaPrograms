package constructor;

import java.util.Scanner;

	public class InstanceVar 
	{
	
		int a,b,result;
		InstanceVar(int a,int b)
		{
			this.a = a;
			this.b = b;
		}
		public void add()
		{
			result= a + b;
			System.out.println("Addition= " +result);
		}
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a");
		int a = s.nextInt();
		System.out.println("Enter b");
		int b = s.nextInt();
		InstanceVar d = new InstanceVar(a,b);
		d.add();
		s.close();
			
	}
	}
