import java.util.Scanner;
class Time {

    public static void main(String[] args) {
        int seconds, minutes, hours;
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a total of seconds:");
        seconds = in.nextInt();
        minutes = seconds / 60;
        hours = minutes / 60;
        minutes = minutes % 60;
        seconds = seconds % 60;
        System.out.printf("%d hours, %d minutes, and %d seconds.\n",hours, minutes, seconds);
    }
}