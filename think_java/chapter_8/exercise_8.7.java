import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please input value to check for diviseables from 1 to 10.");
    int n = in.nextInt();
    System.out.print("Please input size of array to check for prime factors.");
    int arrSize = in.nextInt();
    int[] arr = arrPopulate(arrSize);
    boolean[] a = sieve(n + 1);
    isPrimeFactor(arr, a, n);
  }

  public static boolean[] sieve(int n) {
    boolean[] a = new boolean[n];
    for (int i = 2; i < a.length; i++) {a[i] = true;};
    for (int i = 2; i < a.length; i++) {
      if (a[i] == true) {
        for (int j = i * i; j < n; j = j + i) {
          a[j] = false;
        };
      };
    };
    return a;
  }

  public static int[] arrPopulate(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i ++) {arr[i] = i + 1;}
    return arr;
  }

  public static void isPrimeFactor(int[] arr, boolean[] a, int n) {
    for (int i = 0; i < arr.length; i++) {
      if (n % arr[i] == 0 && a[i] == true) {
        System.out.println(arr[i] + " is prime factor of " + n);
      } else {
        System.out.println(arr[i] + " is not prime factor of " + n);
      }
    }
  }
}
