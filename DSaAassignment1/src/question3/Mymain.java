package question3;

import java.util.Scanner;
import java.util.ArrayList;

public class Mymain {

	public static void main(String[] args) {

		
		int [] economy;
		
		menuLoop : while(true)
		{
		
			System.out.print("Please type 1 for First Class and Please type 2 for Economy: ");
			System.out.println();
			System.out.print("Please type 9 to exit program.");
			Scanner input = new Scanner(System.in);
			int flightClass = input.nextInt();
			
			switch (flightClass)
			{
			case 1: 
				int sizeF = 5;
				ArrayList<Integer> firstClassList = new ArrayList<Integer>(sizeF);
				
				for (int i = 1; i <= sizeF; i++)
				{
					firstClassList.add(i);
				}
						
				
		        for (int i = 0; i < firstClassList.size(); i++) 
		        {
		        	
		        	
		        	int ticket = firstClassList.get(i);
		        	System.out.print("First Class, seat number: " + ticket);
		        	firstClassList.remove(i);
		        	System.out.println();
		        	break;
		        	
		        }
		        
				
				
				break;		
				
			case 2: 
				int sizeE = 5;
				ArrayList<Integer> economyList = new ArrayList<Integer>(sizeE);
				
				for (int i = 1; i <= sizeE; i++)
				{
					economyList.add(i);
				}
						
				
		        for (int i = 0; i < economyList.size(); i++) 
		        {
		        	
		        	
		        	int ticket = economyList.get(i);
		        	System.out.print("Economy, seat number: " + ticket);
		        	economyList.remove(i);
		        	System.out.println();
		        	break;
		        	
		        }
			
			case 9: 
				System.out.print("Exiting Thank You!");
				break menuLoop;
			}
			System.out.println();
		}
	
	}

}
