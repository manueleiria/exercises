import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Main {
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    choice();
  }

  public static void choice() {
    System.out.print("Choose what exercise to run: 8.1 or 8.2.");
    String exercise = in.nextLine();
    if (exercise.equals("8.1")) {
      pointOne();
    } else if (exercise.equals("8.2")) {
      pointTwo();
    } else {
      System.out.println("Your option is not valid.");
      choice();
    }
  }

  public static void pointOne() {
    double[] a = new double[3];
    for (int i = 0; i < a.length; i++) {
      a[i] = i + 1;
    };
    System.out.print("Please input the power.");
    int pow = in.nextInt();
    double[] b = Arrays.copyOf(powArray(a, pow), 3);
    System.out.println(Arrays.toString(b));
  }

  public static double[] powArray(double[] a, int p) {
    for (int i = 0; i < a.length; i++) {
      a[i] = Math.pow(a[i], p);
    };
    return a;
  }

  public static void pointTwo() {
    Random random = new Random();
    int[] a = new int[100];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    };
    System.out.print("Please input the amount of counters.");
    int counter = in.nextInt();
    int[] b = Arrays.copyOf(histogram(a, counter), counter);
    System.out.println(Arrays.toString(b));
  }

  public static int[] histogram(int[] values, int counter) {
    int[] counts = new int[counter];
    int range = (100 / counter) + (100 % counter);
    for (int i = 0; i < counter; i++) {
      for (int value : values) {
        if (values[value] >= (i * range) && values[value] < (i * range + range)) {
          counts[i]++;
        };
      };
    };
    return counts;
  }
}
