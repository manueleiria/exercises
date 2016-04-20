class Main {
  public static void main(String[] args) {
    double x = 2.0;
    int n = 10;
    double y = x;
    for (int i = 1; i <= n; i++) {
      x = x * y;
    }
    System.out.println(x);
  }
}
