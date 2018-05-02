package introduction;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		int l,b,areaR;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length=");
			l = s.nextInt();
		System.out.println("Enter breadth=");
			b = s.nextInt();
			areaR = l * b;
	    System.out.println("Area of rectangle= " +areaR);
	
	    double r,areaC;
		float PI;
		System.out.println("Enter radius=");
			r = s.nextInt();
			areaC =  (3.14 * (r*r));
		System.out.println("Area of circle= " +areaC);
		
	    int b1,h1;
	    double areaT;
		
		System.out.println("Enter b1=");
		b1 = s.nextInt();
		System.out.println("Enter h1=");
		h1 = s.nextInt();
		areaT=0.50*b1*h1;
		System.out.println("Area of traigle=" +areaT);
		
	}

}
