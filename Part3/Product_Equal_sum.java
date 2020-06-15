package Part3;


	import java.util.*;

	public class Product_Equal_sum {
	public static void main(String[] args) {

	int[] number, num1;
	int[] number2, num2;
	int count=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size");
	int size = sc.nextInt();

	if (size < 1 || size > 10) {
	System.out.println(size + " is invalid array size");
	return;
	} else {
	System.out.println("Enter the elements of the first array");
	number = new int[size];
	num1 = new int[size];
	for (int i = 0; i < size; i++) {
	number[i] = sc.nextInt();
	num1[i] = number[i];
	if (number[i] < 10 || number[i] > 999) {
	System.out.println(number[i] + " is not a valid input");
	return;
	}

	}
	System.out.println("Enter the elements of the second array");
	number2 = new int[size];
	num2 = new int[size];
	for (int j = 0; j < size; j++) {
	number2[j] = sc.nextInt();
	num2[j] = number2[j];
	if (number2[j] < 10 || number2[j] > 999) {
	System.out.println(number2[j] + " is not a valid input");
	return;
	}
	}

	}

	for (int i = 0; i < size; i++) {
	int a2 = 1;
	int a3 = 0, a4 = 0;
	int a1 = 0;

	while (number[i] > 0) {
	a1 = number[i] % 10;
	a2 = a2 * a1;
	number[i] = number[i] / 10;

	}


	while (number2[i] > 0) {

	a3 = number2[i] % 10;
	a4 = a4 + a3;
	number2[i] = number2[i] / 10;

	}


	if (a2 == a4) {
	System.out.println(num1[i]);
	System.out.println(num2[i]);
	}else {

	count++;
	}
	}
	if(count==size) {
	   System.out.print("No pair found in ");
	   for(int m=0;m<size;m++){
	System.out.print(num1[m]+" ");
	   }
	   System.out.print(" and ");
	   for(int n=0;n<size;n++){
	     System.out.print(num2[n]+" ");  
	   }
	}
	}
	}




