//Exercise 3.3
import java.util.Scanner;
class SecondsToHours {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int seconds, minutes, hours;

    System.out.print("Please input a total of seconds:");
    seconds = in.nextInt();

    minutes = seconds / 60;
    hours = minutes / 60;
    minutes = minutes % 60;
    seconds = seconds % 60;

    System.out.printf("%d hours, %d minutes, and %d seconds.\n",hours, minutes, seconds);
  }
}
