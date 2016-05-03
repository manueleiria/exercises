//Exercise 8.3
/*WHAT IS THE OUTPUT OF THE FOLLOWING PROGRAM? DRAW A STACK
DIAGRAM THAT SHOWS THE STATE OF THE PROGRAM JUST BEFORE MUS RETURNS. DESCRIBE IN A FEW WORDS WHAT MUS DOES.

mus attributes to temporary variable fus the addition of bob's indexes.

main|bob[]|[ , , , , ]|
make|  a[]|[0,1,2,3,4]|
dub |jub[]|[0,2,4,6,8]|
mus |print|       "20"|
*/
class StackCheckWeirdNames {
  public static int[] make(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = i + 1;
    };
    return a;
  }
  public static void dub(int[] jub) {
    for (int i = 0; i < jub.length; i++) {
      jub[i] *= 2;
    };
  }
  public static int mus(int[] zoo) {
    int fus = 0;
    for (int i = 0; i < zoo.length; i++) {
      fus += zoo[i];
    };
    return fus;
  }
  public static void main(String[] args) {
    int[] bob = make(5);
    dub(bob);
    System.out.println(mus(bob));
  }
}
