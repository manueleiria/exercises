class Main {
  public static void main(String[] args) {
    System.out.println(power(2.0, 10));
  }
  public static double power(double x, int n) {
    if (n <= 0) {
      return 1.0;
    } else if (n % 2 == 0) {
      return power(x, n / 2) * power (x, n / 2);
    } else {
      return x * power(x, n - 1);
    }
  }
}
