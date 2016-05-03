//Exercise 7.5
/*
6. WRITE A LOOP IN MAIN THAT INVOKES CHECK WITH THE VALUES 0.1, 1.0, 10.0, AND 100.0. HOW DOES THE ACCURACY OF THE RESULT VARY AS X VARIES? COMPARE THE NUMBER OF DIGITS OF AGREEMENT RATHER THAN THE DIFFERENCE BETWEEN THE ACTUAL AND ESTIMATED VALUES.

0.1 	  1.010517091807565    	 1.1051709180756477
1.0 	  2.718281828459043    	 2.718281828459045
10.0 	  214299.34701845283     22026.465794806718
100.0   5.677328984550978E20   2.6881171418161356E43

There is a variation that increases as the values increase. This variation ultimately affects the position of calculated digits themselves.

7. ADD A LOOP IN MAIN THAT CHECKS MYEXP WITH THE VALUES -0.1, -1.0, -10.0, AND -100.0. COMMENT ON THE ACCURACY.

-0.1 	  1.0095162581964041    	0.9048374180359595
-1.0 	  1.632120558828555    	  0.36787944117144233
-10.0  -1783.5369797750727    	4.5399929762484854E-5
-100.0 -4.1152715570322774E20   3.720075976020836E-44

Considering the function only properly accepts positive values, negative values are being incorrectly computed, so all results are very incorrect.

*/
class IterativeExponencial {
  public static void main(String[] args) {
    for (double i = 0.1; i <= 100; i = i * 10) {
      check(i);
    }
    for (double i = -0.1; i >= -100; i = i * 10) {
      check(i);
    }
  }
  public static double myexp(double x, double n) {
    double result = 1.0;
    double numenator = x;
    double denominator = 1.0;
    for (double i = 1; i <= n; i++) {
      numenator = numenator * x;
      denominator = denominator * i;
      result = result + numenator / denominator;
    }
    return result;
  }
  public static void check(double x) {
    System.out.printf(x + " \t" + myexp(x, 16.0) + "    \t" + Math.exp(x) + "\n");
  }
}


/*
class Main {
  public static void main(String[] args) {
    System.out.printf("%.4f\n",myexp(1, 3));
  }
  public static double myexp(double x, double n) {
    double e = 1.0;
    for (double i = 1; i <= n; i++) {
      e = e + Math.pow(x, i) / factorial(i);
    }
    return e;
  }
  public static double factorial(double x) {
    double result = 1.0;
    if (x!= 0) {
      for (double i = x; i > 0; i--) {
        result = result * i;
      }
    }
    return result;
  }
}
*/
