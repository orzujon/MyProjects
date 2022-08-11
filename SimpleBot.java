//In this bot asks name of an user and outputs greetings using the input.
//Using special calculation the bot will guesses the users age 
//However, this bot can count from 0 to any positive integer number 

import java.util.Scanner;

public class SimpleBot{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello, my name is Jon!");
    System.out.println("Welcome to the new Guessing your age game!");
    System.out.println("Please Enter your name:");

    String name = scanner.nextLine();

    System.out.println("Thank you " + name + "! Its a fantastic name!");
    System.out.println("That's great to chat with you but let's move on to the essense of this game");
    System.out.println("For me to guess your age, please enter the remainders of your age divided by 3, 5, and 7 on each line");

    int remainder3 = scanner.nextInt();
    int remainder5 = scanner.nextInt();
    int remainder7 = scanner.nextInt();

    System.out.println("Thank you, I see you are pretty fast in math!");
    System.out.print("So your age is: ");

    int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

    System.out.print(age);
    
    System.out.println("Let me show you that I can count to any number you input");
    System.out.println("Please enter your number");
    
    int countingNumber = scanner.nextInt();
    
    for (int n = 0; n <= countingNumber; n++){
      System.out.println(n + "!");
    }
    
    System.out.println("So, now you know I can count to any number you want");
    System.out.println("This is all I can do so far. Have a great day");
  }
}
