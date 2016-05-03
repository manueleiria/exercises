//Exercise 5.3
/*DRAW A STACK DIAGRAM THAT SHOWS THE STATE OF THE PROGRAM AFTER MAIN INVOKES NLINES WITH THE PARAMETER N == 4, JUST BEFORE THE LAST INVOCATION OF NLINES RETURNS.

main     |argument|4||
countdown|       n|4||
countdown|       n|3||
countdown|       n|2||
countdown|       n|1||
countdown|       n|0||*/

class Countdown {
  public static void countdown(int n) {
    if (n == 0) {
      System.out.println("Blastoff!");
    } else {
      System.out.println(n);
      countdown(n - 1);
    }
  }

  public static void main(String[] args) {
    countdown(4);
  }
}
