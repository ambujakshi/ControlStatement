package Part3;


	import java.util.Scanner;

	 class Lucky_Flat {
	   
	    public static void main (String[] args) {
	       
	        int noOfFlats;
	        int[] flatNums;
	        int[] flatNums1;
	        int[] flatNums2;
	        int[] flatNums3;
	       
	       
	        Scanner sc = new Scanner(System.in);
	       
	        System.out.println("Enter the number of flats available:");
	        noOfFlats = sc.nextInt();
	       
	        if(noOfFlats<5||noOfFlats>15){
	            System.out.println(noOfFlats + " is an invalid availability");
	            return;
	        }
	       
	        flatNums= new int[noOfFlats];
	        flatNums1 = new int[noOfFlats];
	        flatNums2 = new int[noOfFlats];
	        flatNums3 = new int[noOfFlats];
	        int count3=0;
	        System.out.println("Enter the flat numbers:");
	       
	        for(int i=0;i<noOfFlats;i++){
	            flatNums[i]=sc.nextInt();
	            flatNums1[i]=flatNums[i];
	            flatNums2[i]=flatNums[i];
	            flatNums3[i]=flatNums[i];
	            int count =0;
	            while(flatNums[i]>0){
	               
	                flatNums[i]=flatNums[i]/10;
	                ++count;
	               
	            }
	            if(count!=3){
	                System.out.println(flatNums1[i]+" is an invalid flat number");
	                return;
	            }
	            int a=0;
	            while(flatNums1[i]>0) {
	            a=flatNums1[i]%10;
	            flatNums1[i]=flatNums1[i]/10;
	            }
	           
	            if(a==8) {
	            System.out.println(flatNums2[i]+" will not be considered");
	            return;
	            }
	           
	           
	           
	        }
	       
	        for(int k=0;k<noOfFlats;k++) {
	        int a1=0,a2=0;
	        int a3=0,a4=0;
	        while(flatNums2[k]>0){
	       
	        a1 = flatNums2[k] % 10;
	a2 = a2 + a1;
	a3=a2;
	a4=a2;



	flatNums2[k] = flatNums2[k] / 10;
	       
	        }
	       
	        int count2=0;
	        while(a2>0) {
	        a2=a2/10;
	       
	++count2;
	        }
	       
	               
	        if(count2!=1) {
	       
	        int a5=0; int a6=0;
	        while(a3>0) {
	       
	        a5=a3%10;
	        a6=a6+a5;
	        a3=a3/10;
	        }
	        if(a6==5) {
	                System.out.println(flatNums3[k]);
	                }else {
	               
	    count3++;
	                }
	        }
	        else {
	       
	        if(a4==5) {
	            System.out.println(flatNums3[k]);
	            }else {
	           
	count3++;
	            }
	        }
	        }
	      if(count3==noOfFlats) {
	     System.out.println("There is no lucky flat in ");
	     for(int g=0;g<noOfFlats;g++) {
	     System.out.println(flatNums3[g]+",");
	     }
	      }
	       
	    }
	   
	}


