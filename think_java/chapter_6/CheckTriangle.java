//Exercise 6.3
class CheckTriangle {

  public static void main(String[] args) {
    System.out.println(isTriangle(5, 2, 3));
  }

  public static boolean isTriangle(int a, int b, int c) {
    return !((a > b + c) || (b > a + c) || (c > a + b));
  }
}
