package Part2;
import java.util.Scanner;

public class Mega_Mart {

   
   public static void main (String []args)
   {
       int percentage = 0;
       double releasevalue = 0;
   Scanner i = new Scanner(System.in);
   System.out.println("Enter the Customer Id");
   int id1=i.nextInt();
   if(id1<=0)
   {
    System.out.println(id1+" is not a valid Customer Id");
   }
  if(id1>=1) {
   System.out.println("Enter the Bill amount");
   double bil=i.nextDouble();
  if(bil<=0) {
  releasevalue = bil;
  int value = (int)releasevalue;
       System.out.println(value+" is not a valid Bill Amount");
  }
  else if(bil>0 && bil<1000)
  {
  releasevalue = bil;
       System.out.printf("Total Price is %.2f\n",releasevalue);
 
  }
    else if(bil>=1000 && id1>=1 && id1<=100)
 
   {
       percentage = 15;
       releasevalue = (bil*(100-percentage)/100);
       System.out.printf("Total Price is %.2f\n",releasevalue);
       
   }
   
   else if(id1>= 101 && id1<=250 )
   {
       percentage = 18;
       releasevalue = (bil*(100-percentage)/100);
       System.out.printf("Total Price is %.2f\n",releasevalue);
     
       
   }
   else if(id1>=251 && id1<=500)
   {
       percentage = 23;
       releasevalue = (bil*(100-percentage)/100);
       System.out.printf("Total Price is %.2f\n",releasevalue);
     
   }
   else if(id1>=501 && id1<=1000)
   {
       percentage = 28;
       releasevalue = (bil*(100-percentage)/100);
       System.out.printf("Total Price is %.2f\n",releasevalue);
     
   }
   else if(id1>=1001)
   {
       percentage = 32;
       releasevalue = (bil*(100-percentage)/100);
       System.out.printf("Total Price is %.2f\n",releasevalue);
     
   }
  }
 
 
  }
   }



