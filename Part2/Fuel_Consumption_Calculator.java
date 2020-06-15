package Part2;

import java.util.Scanner;

public class Fuel_Consumption_Calculator {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int count=0;
			double liters; 
			double distance = 0;
			 
			System.out.println("Enter the no of liters to fill the tank");
			 liters=sc.nextDouble();
			if(liters<=0){
				count=1;
				int value = (int)liters; 
				System.out.println(value+" is an Invalid Input");
				System.exit(0);
			}
				
			if(count==0){
				 System.out.println("Enter the distance covered");
				     distance=sc.nextDouble();
				    if(distance<=0){
						count=1;
						int value1 = (int)distance; 
						System.out.println(value1+" is an Invalid Input");
						System.exit(0);
					}       
			}
			
		   
		    if(count>=0){
		    	
		    	double distanceinmiles=0f,fuelconsumption=0f,fuelingallons=0f,milespergalon=0f;
		    	
		    	if(liters!=0 && distance!=0){
		    		if(liters==0) {
			    		fuelconsumption=0f;
			    		  fuelingallons=0f;
			    	}else {
			    		 fuelconsumption=(liters/distance)*100;
			    		 fuelingallons=(double) (liters*0.2642);
			    	}
			    	
			    	if(distance==0) {
			    		  distanceinmiles=0f;
			    	}else {
			    		  distanceinmiles=(double) (distance*0.6214);
			    	}
			    	
			    	if(distanceinmiles==0 || fuelingallons==0) {
			    		  milespergalon=0f;

			    	}else {
			    		milespergalon=(distanceinmiles/fuelingallons);

			    	}
		    	}
		    	  
		  	    System.out.println("Liters/100KM");
		  	    System.out.println(String.format("%.2f",fuelconsumption));
		  	    System.out.println("Miles/gallons");
		  	    System.out.println(String.format("%.2f", milespergalon));
		    }
		    
		  
		}

	}