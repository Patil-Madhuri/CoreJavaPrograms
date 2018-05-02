package introduction;

import java.util.Scanner;

public class Atmdemo {

	public static void main(String[] args) {
		int amt,notes;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount=");
		amt = s.nextInt();
		
		if(amt%100 != 0)
		{
			System.out.println("InValid Amount\n");
		}
		else
		{
			
			if(amt >= 1000)
			{
				notes = amt / 1000;
				amt = amt % 1000;
				System.out.println("No of 1000 notes= "  +notes);
			}
			if(amt >= 500)
			{
				notes = amt /500;
				amt = amt % 500;
				System.out.println("No of 500 notes= "  +notes);
			}
			
			if(amt >= 100)
			{
				notes = amt / 100;
				
				System.out.println("No of 100 notes= "  +notes);
				System.out.println("valid Amount\n");
			}
			
		
		}		
		}
		
		
	}



