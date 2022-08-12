// This program reads an array of ints and integer numbers n
//Next it checks how many times n occurs in the array


import java.util.Scanner;

class IterateOverArrays {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the length of your array: ");
        int arrayLength = scanner.nextInt();
        int[] numbersArray = new int[arrayLength];
        
        System.out.print("Enter the values of your array with a blank space in between: ");
        for (int n = 0; n < numbersArray.length; n++) {
            numbersArray[n] = scanner.nextInt();
        }
        System.out.print("Please enter the value you want me to count over your array list: ");
        int number = scanner.nextInt();
        int i = 0;
        for (int x: numbersArray) {
            if (x == number) {
                i++;
            }
        }
        System.out.println("Your value " + number + " has occured " + i + " times");
        System.out.println("Bai, have a good day!");
    }
}
