import java.util.Scanner;
class Convert {

    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Please indicate temperature in Celsius:");
        celsius = in.nextDouble();

        // convert and output the result
        fahrenheit = 9.0/5.0 * celsius + 32.0;
        System.out.printf("%.1f C = %.1f F\n",celsius, fahrenheit);
    }
}
