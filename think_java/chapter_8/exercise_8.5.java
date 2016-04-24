import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please input size of array to check for prime numbers.");
    int n = in.nextInt();
    String isPrime = "not prime";
    boolean[] a = sieve(n + 1);
    for (int i = 0; i < a.length; i++) {
      if (a[i] == true) {
      System.out.println(i + ": prime");
      } else {
      System.out.println(i + ": not prime");
      }
    }
  }
  
  public static boolean[] sieve(int n) {
    boolean[] a = new boolean[n];
    for (int i = 2; i < a.length; i++) {a[i] = true;};
    for (int i = 2; i < a.length; i++) {if (a[i] == true) {
      for (int j = i * i; j < n; j = j + i) {a[j] = false;};
    };};
    return a;
  }
}
