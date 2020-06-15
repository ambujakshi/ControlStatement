package Part2;
import java.util.Scanner;
public class Count_digit {
public static int number, number1;
public static int digit;
public static int count = 0;

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
//Main m=new Main();
 number=sc.nextInt();
 number1= number;
if(number < 1)
{
System.out.println(number + " falls behind the limit");
System.exit(number);
}
if(Integer.toString(number).length() > 9)
{
System.out.println(number + " exceeds the limit");
System.exit(number);
}
 digit=sc.nextInt();
if(Integer.toString(digit).length() > 1)
{
System.out.println(digit + " is not valid");
System.exit(digit);
}
while(number > 0) {
if(number % 10 == digit)
count++;
number = number/10;
}
if(count == 0)
{
System.out.println(digit +" is not available in " + number1);
}
else
{
System.out.println("Count of " + digit +" in "+ number1 + " is " + count);
}
}

}
