class Main {
  public static void main(String[] args) {
    System.out.printf("%.4f\n", squareRoot(12));
  }
  public static double squareRoot(double a) {
    double x = a / 2.0;
    double i = 1.0;
    while (i > 0.0001) {
      i = Math.abs(x - rootCheck(a, x));
      x = rootCheck(a, x);
    }
    return x;
  }
  public static double rootCheck(double a, double x) {
    return (x + a / x) / 2.0;
  }
}
