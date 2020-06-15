package Part3;

import java.util.Scanner;

public class Return_Product {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Array size");
		int m = in.nextInt(); 
		if(m<0) {
		     System.out.println(m + " is an invalid array size");
		     return;
		      }	
		 int[] array1 = new int[m];
		  int product = 1;
		  int count=0;
		  boolean flag=false;
		 System.out.println("Array elements");
	      
	     for (  int i = 0 ; i < m ; i++ ) {
	    	 array1[i] = in.nextInt();
	    	 //if(array1[i]%array1[i]==0) { 
	    	 if (array1[i]<=0 ) {
	    		System.out.println(array1[i]+ " is an invalid array element");
	    		return;
	    	 }
	     }
	    		
	    	for(int k=0;k< array1.length;k++) {	
	    		flag=false;
	    		int nbr= array1[k];
	    		if(nbr==1) {
	    			continue;
	    		}
	    		
	    		for(int j=2; j<nbr;j++) {
	    			if(nbr%j==0) {
	    				flag=true;
	    				break;	
	    			}
	    		}
	    		if(flag==false) {
	    		 product = product * array1[k];
	    		 count++;
	    	 }
	    	}
	    	in.close();
	    	if(count==0) {
	    	
	    	 System.out.println("No element found in");
	    	 for(int i=0; i<array1.length;i++) {
	    		 System.out.println(array1[i]);
	    		 if(i<array1.length-1) {
	    			 System.out.println(",");	 
	    		 }
	    	}
	    	 
	     }
	    	else {
	    		System.out.println(product);
	    	}
	   
	     
			   }
		
}

