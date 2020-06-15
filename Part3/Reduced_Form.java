package Part3;

	import java.util.Arrays;
	import java.util.Scanner;

	public class Reduced_Form {
	public static void main(String[] args) {


	int size;
	int[] array;
	int[] array1;

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of Array:");

	size = sc.nextInt();
	if (size < 5 || size > 10) {
	System.out.println(size + " is an invalid array size");
	return;

	} else {
	array = new int[size];
	array1 = new int[size];
	for (int l = 0; l < size; l++) {

	array[l] = sc.nextInt();
	array1[l]=array[l];
	if (array[l] < 0) {
	return;
	}

	}

	}


	int[] index = new int[size];

	for (int i = 0; i < array.length; i++) {
	for (int j = i + 1; j < array.length; j++) {
	int tmp = 0;
	if (array[i] > array[j]) {
	tmp = array[i];
	array[i] = array[j];
	array[j] = tmp;
	}
	}
	}

	for (int k = 0; k < array.length; k++) {
	for (int m = 0; m < array1.length; m++) {
	if (array[k] == array1[m]) {
	index[k] = m;
	}
	}

	}

	for (int n = 0; n < size; n++) {
	System.out.print(index[n]+" ");
	}
	}
	}



