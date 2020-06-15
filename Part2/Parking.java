package Part2;
import java.util.Scanner;

	public class Parking {
		public static void main(String[] args) {
		     
			Scanner sc=new Scanner(System.in);
			int check=0; int carcount = 0;
			
			int a[]=new int[4];
			
			System.out.println("B1");
		     a[0]=sc.nextInt();
		     if(a[0]<0){
		    	 check=1;
		    	 System.out.println(""+a[0]+" is not a valid input");
		     }
		    
				if(check==0){
					System.out.println("B2");
				    a[1]=sc.nextInt();
				    if(a[1]<0){
				    	 check=1;
				    	 System.out.println(""+a[1]+" is not a valid input");
				     }
				    
				}
			
				if(check==0){
		    System.out.println("B3");
		     a[2]=sc.nextInt();
		     
		     if(a[2]<0){
		    	 check=1;
		    	 System.out.println(""+a[2]+" is not a valid input");
		     }
		     
				}
		     
				if(check==0){
				
		    System.out.println("B4");
		     a[3]=sc.nextInt();
		     
		     
		     if(a[3]<0){
		    	 check=1;
		    	 System.out.println(""+a[3]+" is not a valid input");
		     }
		     
				}
				
				
				if(check==0){
		     
		    System.out.println("Car count");
		     carcount=sc.nextInt();
		    
		    if(carcount<0){
		   	 check=1;
		   	 System.out.println(""+carcount+" is not a valid input");
		    }
		    
				}
		   
				if(check==0){
		    int addval=0;int tot= 0;int count=0;
		    for( int i=0;i<a.length;i++){
		    	
		    	
		    	
		    	
		    tot= addval+a[i];
		    	
		    	
				if(tot>=carcount){
		    		int bnum=i+1;
					 System.out.println("The car can be parked at B"+bnum+"");
					 count=1;
		    		break;
		    		
		    	}
				
				   addval=tot;
		    }
		    
		    if(count==0){
		    	  if(carcount>tot){
		    	    	
		    	    	 System.out.println("Parking slots in full");
		    	    }
		    }
		  
		 
			
				}
			}

			
	}


