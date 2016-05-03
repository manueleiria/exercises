//Exercise 8.4
import java.util.Arrays;

class MaxIndex {
  public static void main(String[] args) {
    int[] a = new int[4];
    for (int i = 0; i < a.length; i++) {
      a[i] = i + 1;
    };
    System.out.println(Arrays.toString(a));
    System.out.println(indexOfMax(a));
  }
  public static int indexOfMax(int[] maxArray) {
    int maxIndex = maxArray[0];
    for (int max : maxArray) {
      if (maxIndex < max) {
        maxIndex = max;
      };
    };
    return maxIndex;
  }
}
