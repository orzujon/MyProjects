// Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.

import java.util.Scanner;

public class SumArrayElementsGreaterThanValue {
	 public static void main(String[] args) {
		// put your code here
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Please enter the length of your array: ");
	    int arrayLength = scanner.nextInt();
	    
	    System.out.print("Enter the values of your array with a blank space in between: ");
	    int[] numbersArray = new int[arrayLength];
	    for (int n = 0; n < numbersArray.length; n++) {
	        numbersArray[n] = scanner.nextInt();
	    }
	    System.out.print("I will give you the sum of all elements in the array greater than your choice: ");
	    int number = scanner.nextInt();
	    int i = 0;
	    for (int x: numbersArray) {
	        if (x > number) {
	            i = i + x;
	        }
	    }
	    System.out.println("The sum of all elements in the array greater than " + number +  " is " + i);
		}
	}

