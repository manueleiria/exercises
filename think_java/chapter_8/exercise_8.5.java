import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please input size of array to check for prime numbers.");
    int n = in.nextInt();
    System.out.println(Arrays.toString(sieve(n)));
  }
  public static int[] sieve(int n) {
    int[]     a = new int[n];
    boolean[] b = new boolean[n];
    for (int i = 0; i < a.length; i++) {a[i] = i + 1;};
    
    return a;
  }
}
