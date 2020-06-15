package Part3;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		    Scanner sc=new Scanner(System.in);
		     int[] ar={2,4,6,9,11,34,654,23,32,54,76,21432,32543,435,43543,643,2646,4567,457654,75,754,7,567865,8765877,53,2};
		     int query=sc.nextInt();
		     int length=ar.length;
		     int count=0;
		     for (int i=0;i<query ;i++ ) {
		        int x=sc.nextInt();
		        for (int j=0;j<length ;j++ ) {
		            if(ar[j]>x){
		                if(ar[j]%x==0){
		                    count++;
		                }
		            }
		        }
		        System.out.println("Count:"+count);
		     }
		}

	}


