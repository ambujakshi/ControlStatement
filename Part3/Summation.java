package Part3;

import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;

public class Summation {
//@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.println("Enter the array size");
int m = in.nextInt();  
		     if(m>10 || m<1) {
		     System.out.println(m + "is an invalid array size");
		     return;
		      }		     
		     int[] array1 = new int[m];
		     int[] array2 = new int[m];
		     int count=0;		   
		      System.out.println("Enter the elements in first array");
		      
		     for (  int i = 0 ; i < m ; i++ ) {
		    	 array1[i] = in.nextInt();
		     if(array1[i]%2==0) {
		    	 count++;
		     }
		     }	      
		   System.out.println("Enter the elements in second array");
		      for ( int i = 0 ; i < m ; i++ ) {
		    	  array2[i] = in.nextInt();
		    	  if(array2[i]%2==0) {
				    	 count++;
		    	  }
		      }
		      
			  if(count==0) {
				   System.out.println("There are no even elements in the arrays");
				    }
				   in.close();    	
				   for (int i = 0; i < m; i++) {
					   if(array1[i] % 2==0 && array2[i]%2==0) {
					   System.out.println(array1[i]+array2[i]);
					   }else
					   System.out.println("0");
					   }
					   }
		      }

