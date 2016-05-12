//Exercise 6.7
class RecursiveSumOfOdds {


  public static void main(String[] args) {

    System.out.println(oddSum(6));
  }


  public static int oddSum(int n) {

    if ((n - 1) % 2 != 1) {

      if (n == 1) {
        return n;

      } else {
        return n + oddSum(n - 2);
      }
      
    } else {
      return oddSum(n - 1);
    }
  }
}
