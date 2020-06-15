package Part2;
import java.util.Scanner;

public class Holiday_trip {

        static int price = 0;
	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
		System.out.println("Enter the flight name");
		String fname = sc.nextLine();

		System.out.println("Enter the class");
		String cls = sc.nextLine();

		System.out.println("Enter the number of seats");
		int seats = sc.nextInt();

		System.out.println("Card Payment");
		String cp = sc.next();


		if (fname.equalsIgnoreCase("Air India")) {
			if (cls.equalsIgnoreCase("Travel class")) {
				price = 3200;
			}
			if (cls.equalsIgnoreCase("Economy class")) {
				price = 6950;
			}
			if (cls.equalsIgnoreCase("Business class")) {
				price = 10340;
			}

			if (cp.equalsIgnoreCase("y")) {
				double p = 10.5;
				double c = ((price * seats) - (price * seats * (p / 100)));
				int value = (int) c;
				System.out.println(value);
			}

			else {
				int value = price*seats;
				System.out.println(value);
			}
		} else if (fname.equalsIgnoreCase("Spice Jet")) {
			if (cls.equalsIgnoreCase("Travel class")) {
				price = 3450;
			}
			if (cls.equalsIgnoreCase("Economy class")) {
				price = 7945;
			}
			if (cls.equalsIgnoreCase("Business class")) {
				price = 9500;
			}
			
				if(seats>5)
			{
				price = price-((price*10)/100);
			}
			if(seats>10)
			{
				price = price-((price*15)/100);
			}
			
			if (cp.equalsIgnoreCase("y")) {
				double p = 7.5;
				double c = ((price * seats) - (price * seats * (p / 100)));
				int value = (int) c;
				System.out.println(value);
			} else {
				int value = price*seats;
				System.out.println(value);
			}
		} 
		
		
		
		
		else if (fname.equalsIgnoreCase("Go Air")) {
			if (cls.equalsIgnoreCase("Travel class")) {
				price = 3300;
			}
			if (cls.equalsIgnoreCase("Economy class")) {
				price = 7250;
			}
			if (cls.equalsIgnoreCase("Business class")) {
				price = 9890;
			}
			if (cp.equalsIgnoreCase("y")) {
				double p = 9.5;
				double c = ((price * seats) - (price * seats * (p / 100)));
				int value = (int) c;
				System.out.println(value);
			} else {
				int value = price*seats;
				System.out.println(value);
			}
		} else if (fname.equalsIgnoreCase("IndiGo")) 
		{
			if (cls.equalsIgnoreCase("Travel class")) {
				price = 3490;
			}
			if (cls.equalsIgnoreCase("Economy class")) {
				price = 7560;
			}
			if (cls.equalsIgnoreCase("Business class")) {
				price = 9990;
			}
			
				if(seats>5)
			{
				price = price-((price*10)/100);
			}
			if(seats>10)
			{
				price = price-((price*15)/100);
			}
			if (cp.equalsIgnoreCase("y")) {
				double p = 8.5;
				double value = ((price * seats) - (price * seats * (p / 100)));
				System.out.println(value);
			} else {
				int value = price*seats;
				System.out.println(value);
			}
		}
			    
	}

}
