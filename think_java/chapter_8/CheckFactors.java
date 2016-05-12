//Exercise 8.6
import java.util.Arrays;
import java.util.Scanner;


class CheckFactors {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Please input value to check for diviseables from 1 to 10.");
    int n = in.nextInt();

    int[] arr = arrPopulate(10);

    isDivisible(arr, n);
  }


  public static int[] arrPopulate(int n) {
    int[] arr = new int[n];

    for (int i = 0; i < n; i ++) {arr[i] = i + 1;}

    return arr;
  }

  public static void isDivisible(int[] arr, int n) {

    for (int i = 0; i < arr.length; i++) {

      if (n % arr[i] == 0) {
        System.out.println(arr[i] + " is factor of " + n);
        
      } else {
        System.out.println(arr[i] + " is not a factor of " + n);
      }
    }
  }
}
