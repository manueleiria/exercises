//Exercise 3.2
import java.util.Scanner;


class ConvertTemperature {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double celsius, fahrenheit;

    // prompt the user and get the value
    System.out.print("Please indicate temperature in Celsius:");
    celsius = in.nextDouble();

    // convert and output the result
    fahrenheit = 9.0/5.0 * celsius + 32.0;
    System.out.printf("%.1f C = %.1f F\n",celsius, fahrenheit);
  }
}
