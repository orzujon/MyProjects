//This bot will ask the user for the size of array first and the integer numbers to fill the array
//Next it will output the sum of those numbers

import java.util.Scanner;

class ArrayIteration {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] numbers = new int[length];
        int sum = 0;
        for (int n = 0; n < numbers.length; n++) {
            numbers[n] = scanner.nextInt();
            sum += numbers[n];
        }
        System.out.println(sum);
    }
}