/*The point of this exercise is to practice reading code and to
make sure that you understand the flow of execution through a program with
multiple methods.
1. WHAT IS THE OUTPUT OF THE FOLLOWING PROGRAM? BE PRECISE ABOUT WHERE
THERE ARE SPACES AND WHERE THERE ARE NEWLINES.

"No, I wug.
 You wugga wug.
 I wug."

2. DRAW A STACK DIAGRAM THAT SHOWS THE STATE OF THE PROGRAM THE FIRST
TIME PING IS INVOKED.

  main      |argument| ||
  zoop      |        | ||
  baffle    |        | ||
  ping      |        | ||*/

class Main4 {

  public static void zoop() {
    baffle();
    System.out.print("You wugga ");
    baffle();
  }

  public static void main(String[] args) {
    System.out.print("No, I ");
    zoop();
    System.out.print("I ");
    baffle();
  }

  public static void baffle() {
    System.out.print("wug");
    ping();
  }

  public static void ping() {
    System.out.println(".");
  }

}
