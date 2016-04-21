class Main {
  public static void main(String[] args) {
    for (double i = -0.1; i >= -100; i = i * 10) {
      System.out.println(i + " \t" + gauss(i, 16.0) + "    \t" + Math.exp(i));
    }
  }
  public static double gauss(double x, double n) {
    double result = 1.0;
    double numenator = x;
    double denominator = 1.0;
    int prefix = -1;
    for (double i = 1; i <= n; i++) {
      prefix = prefix * (-1);
      numenator = numenator * x * x;
      denominator = denominator * i;
      result = result + prefix * numenator / denominator;
    }
    return result;
  }
}
