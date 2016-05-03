//Exercise 7.4
class IterativeFactorial {
  public static void main(String[] args) {
    int result = 1;
    int factorial = 2;
    if (factorial != 0) {
      for (int i = factorial; i > 0; i--) {
        result = result * i;
      }
    }
    System.out.println(result);
  }
}
