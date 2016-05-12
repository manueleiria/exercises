//Exercise 8.8
import java.util.Arrays;
import java.util.Scanner;


class MaxInRange {
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    int size = inputNum("How many indexes should your array have?");

    int[] arr = createIntArr(size);

    int lowIndex = indexRangeMaker(arr, true, 0);
    int highIndex = indexRangeMaker(arr, false, lowIndex);

    int highestValIndex = maxInRange(arr, lowIndex, highIndex);

    System.out.println("The largest element in the array is in index " + highestValIndex + ", with value " + arr[highestValIndex]);
  }


//Input methods
  public static int inputNum(String message) {

    System.out.print(message + " ");
    String str = in.nextLine();

    if (str.matches("([0-9/-]+)")) {
      int val = Integer.parseInt(str);
      return val;

    } else {
      System.out.println("ERROR: The inputted value is not an integer.");
      return inputNum(message);
    }
  }


  public static int indexRangeMaker(int[] arr, boolean isLowIndex, int lowIndex) {
    int val;

    if (isLowIndex) {
      val = inputArrIndex(arr, "Please input starting position in the array to check for the maximum value.");

    } else {
      val = inputArrIndex(arr, "Please input ending position in the array to check for the maximum value.");

      if (val < lowIndex) {
        System.out.println("ERROR: The inputted value is below bounds.");
        return indexRangeMaker(arr, false, lowIndex);
      }
    }

    return val;
  }


  public static int inputArrIndex(int[] arr, String message) {

    int val = inputNum(message);

    if (val > arr.length-1 || val < 0) {
      System.out.println("ERROR: The inputted value is out of bounds.");
      return inputArrIndex(arr, message);

    } else {
      return val;
    }
  }


//Array building methods
  public static int[] createIntArr(int size) {
    int[] arr = new int[size + 1];

    for (int i = 0; i <= size; i++) {
      arr[i] = (int)(Math.random() * size);
    }

    return arr;
  }


//Calculate maximum in range for arrays
  public static int maxInRange(int[] arr, int lowIndex, int highIndex) {

    if (arr[lowIndex] > arr[highIndex]) {
      return maxInRange(arr, lowIndex, highIndex-1);

    } else if (arr[lowIndex] < arr[highIndex]) {
      return maxInRange(arr, lowIndex+1, highIndex);
      
    } else {
      return lowIndex;
    }
  }
}
