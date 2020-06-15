package Part3;
import java.util.Scanner;

public class UniqueItems {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter the number of items:");
int noOfItem = scan.nextInt();

if (noOfItem < 5 || noOfItem > 20) {
System.out.println(noOfItem + " is an invalid item count");
return;
}

int[] array = new int[noOfItem];

int count = noOfItem;

System.out.println("Enter the bar code ID for "+noOfItem+" items:");
for (int i = 0; i < noOfItem; i++) {
array[i] = scan.nextInt();

if (String.valueOf(array[i]).length() != 3) {
System.out.println(array[i] + " is an invalid bar code ID");
return;
}
}

scan.close();

for (int k = 0; k < noOfItem; k++) {

String digit1 = String.valueOf(array[k]).substring(0, 1);
String digit2 = String.valueOf(array[k]).substring(1, 2);
String digit3 = String.valueOf(array[k]).substring(2, 3);

if (digit1.equals(digit2) || digit2.equals(digit3) || digit1.equals(digit3)) {
count--;
continue;
}else {
System.out.println(array[k]);
}
}
if((count < noOfItem && count!=0) || count==noOfItem) {
System.out.println("There are "+count+" items with Unique number in the bar code ID");

}
if (count == 0) {
System.out.print("There are no items with unique number in ");
for (int j = 0; j < array.length; j++) {
System.out.print(array[j]);
if (j < array.length - 1) {
System.out.print(",");
}
}
}
}
}
