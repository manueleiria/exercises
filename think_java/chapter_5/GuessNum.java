//Exercise 5.7
import java.util.Scanner;
import java.util.Random;


class GuessNum {


  public static void main(String[] args) {
    Random random = new Random();
    int rdmNumber = random.nextInt(100) + 1;
    int usrNumber = 0;

    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");
    guess(rdmNumber, usrNumber);

    System.out.printf("Congratulations, you got it right!");
  }


  public static void guess(int rdmNumber, int usrNumber) {
    Scanner in = new Scanner(System.in);

    System.out.print("Type a number: ");
    usrNumber = in.nextInt();

    System.out.printf("Your guess is: %d.\n", usrNumber);

    if (rdmNumber > usrNumber) {
      System.out.println("Your guess was too low. Try again");
      guess(rdmNumber, usrNumber);
      
    } else if (rdmNumber < usrNumber) {
      System.out.println("Your guess was too high. Try again");
      guess(rdmNumber, usrNumber);
    }
  }
}
