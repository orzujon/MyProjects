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
  }
}
