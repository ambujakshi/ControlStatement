package Part2;
import java.util.Scanner;
public class Recharge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;int exceed=0;int noofsms = 0;int noofcalls;
	
		System.out.println("Enter the number of calls:");
		 noofcalls = sc.nextInt();
		
		if(noofcalls<0){
			count=1;
			System.out.println(""+noofcalls+" is an Invalid Input");
		}
		if(noofcalls>1000){
			exceed=1;
			System.out.println(""+noofcalls+" exceeds the maximum limit");
		}
		
		if(count==0 && exceed==0){
		
		System.out.println("Enter the number of SMS:");
		 noofsms = sc.nextInt();
		
		 if(noofsms<0){
				count=1;
				System.out.println(""+noofsms+" is an Invalid Input");
			}
		 
		if(noofsms>1000){
			exceed=1;
			System.out.println(""+noofsms+" exceeds the maximum limit");
		}
		
		}
		if(count==0 && exceed==0){
			
			int extracalls=0, extrasms=0 ;
		if(noofcalls<100) {
			 extracalls = 0;
			
		}
		else {
			 extracalls = (noofcalls - 100);
			
		}
		
		if(noofsms<100) {
			 extrasms =0;
		}
		else {
			 extrasms = (noofsms - 100);
		}
		
		
		

		float totcallamount =  (float) (extracalls * 1.5);
		float totsmsamount =  (float) (extrasms * 0.5);

		float finalplanbill = (float) (totcallamount + totsmsamount + 150
				+ (0.055 * (totcallamount + totsmsamount + 150)));
		
		 
		 
		System.out.println("Amount to be paid is Rs."+String.format("%.2f", finalplanbill)+"");
	}
		
		
	}
		

}
