package constructor;

import java.util.Scanner;

public class Area {
	int r,l,b;
	double areac,arear;
	
	Area(int r)
	{
		this.r = r;
	}
	
	Area(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	
	public void areaCircle()
	{
		areac = 3.14 * r *r;
		System.out.println("Area of circle= " +areac);
	}
	
	public void areaRect()
	{
		arear = l * b;
		System.out.println("Area of rectangle= " +arear);
	}
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Radius=");
		int r = s.nextInt();
		Area a = new Area(r);
		a.areaCircle();

		System.out.println("Enter length=");
		int l = s.nextInt();
		System.out.println("Enter breadth=");
		int b = s.nextInt();
		Area a1 = new Area(l,b);
		a1.areaRect();
		
		
	}
}
