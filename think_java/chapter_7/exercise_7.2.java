class Main {
  public static void main(String[] args) {
    System.out.println(squareRoot(9.0));
  }
  public static void squareRoot(double a) {
    double x = a / 2;
    x = (x + a/x) / 2;
    return x;
  }
}
