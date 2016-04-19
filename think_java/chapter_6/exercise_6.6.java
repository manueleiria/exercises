/*
1. DRAW A STACK DIAGRAM SHOWING THE STATE OF THE PROGRAM JUST BEFORE THE LAST INVOCATION OF PROD COMPLETES.

Main|Argument|1|Argument|4||
prod|       m|1|       n|4||
prod|       m|1|       n|3||
prod|       m|1|       n|2||
prod|       m|1|       n|1||


2. WHAT IS THE OUTPUT OF THIS PROGRAM?

"24"

3. EXPLAIN IN A FEW WORDS WHAT PROD DOES.

Prod produces factorials.

4. REWRITE PROD WITHOUT THE TEMPORARY VARIABLES RECURSE AND RESULT.

*/

class Main {
  public static void main(String[] args) {
    System.out.println(prod(1, 4));
  }
  public static int prod(int m, int n) {
    if (m == n) {
      return n;
    } else {
      return n * prod(m, n - 1);
    }
  }
  /*public static int prod(int m, int n) {
    if (m == n) {
      return n;
    } else {
      int recurse = prod(m, n-1);
      int result = n * recurse;
      return result;
    }
  }*/
}
