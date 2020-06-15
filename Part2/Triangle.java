package Part2;
import java.util.Scanner;

public class Triangle {
			
		  public static void main(String[] args) {
			  Scanner s = new Scanner(System.in);
			  System.out.println("Enter three sides of triangle");
			  int a = s.nextInt();
			
			  if(a<=0 ) 
			 {
				 System.out.println(""+a+" is an Invalid Length");
			 }
			 
			  int b = s.nextInt();
			  
			  if(b<=0 ) 
			 {
				 System.out.println(""+b+" is an Invalid Length");
			 }
			  int c = s.nextInt();
			 if(c<=0) 
			 {
				 System.out.println(""+c+" is an Invalid Length");
			 }
			  
			 else if (a>0 && a==b && b>0 && b==c && c>0) 
			  {
				  System.out.println(""+a+","+b+","+c+" are the sides of Equilateral Triangle");
			  }
			  
			  else if((a>0 && a==b) || (a>0 && a==c) || (b>0 && b==c)) //check whether two sides are equal  
			     
			  {	    
				  System.out.println(""+a+","+b+","+c+" are the sides of Isosceles Triangle");
			  }
			
			  else if (a>0 && a!=b && a>0 &&a!=c && b>0 && b!=c) 
			  { 
				 System.out.println(""+a+","+b+","+c+" are the sides of Scalene Triangle");
			  }
			 
		  }	   
		 
		  }

