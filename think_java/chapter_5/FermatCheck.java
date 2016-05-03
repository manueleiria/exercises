//Exercise 5.4
import java.lang.Math;

class FermatCheck {
  public static void checkFermat(int a, int b, int c, int n) {
    boolean fermat = ((Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n));
    if (n > 2 && fermat) {
      System.out.println("Holy smokes, Fermat was wrong!");
    } else {
      System.out.println("No, that doesn't work.");
    }
  }

  public static void main(String[] args) {
    checkFermat(3, 4, 5, 3);
  }
}
