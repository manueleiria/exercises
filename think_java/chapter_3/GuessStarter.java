//Exercise 3.4
import java.util.Scanner;
import java.util.Random;

/**
 * Starter code for the "guess my number" exercise.
 */
class GuessStarter {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int rdmNumber, usrNumber, difNumber;
    Random random = new Random();

    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");
    rdmNumber = random.nextInt(100) + 1;

    System.out.print("Type a number: ");
    usrNumber = in.nextInt();

    difNumber = rdmNumber - usrNumber;

    System.out.printf("Your guess is: %d.\n", usrNumber);
    System.out.printf("The number I was thinking of is: %d.\n", rdmNumber);
    System.out.printf("You were off by: %d.\n", difNumber);
  }
}
