package Part3;

import java.util.Scanner;

public class Subtract_the_Max {
	/*private static Object[] arr;
	//method to get maximum number from array elements
		int getMax(int[]inputArray)
		{
			int maxValue=inputArray[0];

			for(int i=1;i<inputArray.length;i++)
			{
				if(inputArray[i]>maxValue)
				{
					maxValue=inputArray[i];
				}
			}
			return maxValue;
		}*/
	
	
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	      System.out.println("Enter the size of an array:");
	      int m = in.nextInt();
	      if(m<3 || m>20 ) {
	    	  System.out.println( m + " is an invalid size");
	    	return;
	      }
	      
	      
	     int array1[] = new int[m];
	     
	      System.out.println("Enter array elements:");
	      
	      for ( int i = 0 ; i < m ; i++ )
	    	  array1[i] = in.nextInt(); 
	      in.close();
	      
	      
	  int[] result= array1.clone();
	  for (int i = 0; i < array1.length; i++) {
		  for (int k = i; k < array1.length; k++) {

		  if (array1[i] > array1[k]) {
		  int temp = array1[k];
		  array1[k] = array1[i];
		  array1[i] = temp;
		  }
		  }
		  }
		  for (int i = 0; i < result.length; i++) {
		  System.out.println(array1[array1.length - 1] - result[i]);
		  }
		  }
		  }
