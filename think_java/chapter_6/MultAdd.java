//Exercise 6.4
class MultAdd {


  public static void main(String[] args) {

    System.out.println(multadd(1.0, 2.0, 3.0));

    double a1 = Math.cos(Math.PI/4.0);
    double a2 = 1.0/2.0;
    double a3 = Math.sin(Math.PI/4.0);

    System.out.println(multadd(a1, a2, a3));

    double b1 = Math.log(10);
    double b2 = 1.0;
    double b3 = Math.log(20);

    System.out.println(multadd(b1, b2, b3));

    System.out.println(expSum(2.0));
  }

  public static double multadd(double a, double b, double c) {

    return a * b + c;
  }

  public static double expSum(double x) {
    double a = x;
    double b = Math.exp(-x);
    double c = Math.sqrt(1.0 - b);
    
    return multadd(a, b, c);
  }
}
