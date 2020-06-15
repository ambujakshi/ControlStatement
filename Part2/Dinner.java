package Part2;

import java.util.Scanner;

public class Dinner {
	 
	static int i=2;  
				long lcmCal(long n1,long n2,long temp,long res) 
				{
				  if(res%n2!=0 || res%n1!=0)
					{
					res=temp*i;
					i=i+1;
					return lcmCal(n1,n2,temp,res);
					}
				  return res;
			 	 }
	public static void main(String arg[]) 
				{
				    long a,b,r,t,lc;
			        Scanner sc=new Scanner(System.in);
				    System.out.println("Enter the day interval of Sam:");
			        a=sc.nextLong();
				    System.out.println("Enter the day interval of Riya:");
			        b=sc.nextLong();
				    if(a<=0 || b<=0)
				    {
				    System.out.println(""+a+" to "+b+" is not a valid interval");
				    System.exit(0);
				    }
				    
				    Dinner l=new Dinner();
				    
				    if(a>b) 
					r=a;
				    else
					r=b;
				    t=r;
				    lc=l.lcmCal(a,b,t,r);
				    System.out.println("Sam and Riya will have their dinner on day " +lc);
				}
			}

