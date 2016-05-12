//Exercise 9.1
class TEST {

//1.
  public static void main(String[] args) {
    String a = "This is a string ";
    boolean b = true;
    int c = 12;
    char d = 'a';
    long e = 5L;
    double f = 6.0;

    System.out.println(a + b + c + d + e + f);
    System.out.println(e + f + c);
    System.out.println(c + e);

    System.out.println("" + b);
    char test = 'a';
    int i = (int)test-97;
    System.out.println(i);
  }

/*2.
  ____________________________________________________________________
  ||         || boolean || char    || int     || double  || String  ||
  ||_________||_________||_________||_________||_________||_________||
  || boolean || ILLEGAL || ILLEGAL || ILLEGAL || ILLEGAL ||Concat(S)||
  ||_________||_________||_________||_________||_________||_________||
  || char    || ILLEGAL || Add(i)  || Add(i)  || Add(d)  ||Concat(S)||
  ||_________||_________||_________||_________||_________||_________||
  || int     || ILLEGAL || Add(i)  || Add(i)  || Add(d)  ||Concat(S)||
  ||_________||_________||_________||_________||_________||_________||
  || double  || ILLEGAL || Add(d)  || Add(d)  || Add(d)  ||Concat(S)||
  ||_________||_________||_________||_________||_________||_________||
  || String  ||Concat(S)||Concat(S)||Concat(S)||Concat(S)||Concat(S)||
  ||_________||_________||_________||_________||_________||_________||
*/

/*3.THINK ABOUT SOME OF THE CHOICES THE DESIGNERS OF JAVA MADE WHEN THEY FILLED
    IN THIS TABLE. HOW MANY OF THE ENTRIES SEEM UNAVOIDABLE, AS IF THERE WAS NO
    OTHER CHOICE? HOW MANY SEEM LIKE ARBITRARY CHOICES FROM SEVERAL EQUALLY
    REASONABLE POSSIBILITIES? WHICH ENTRIES SEEM MOST PROBLEMATIC?

    Most of the entries regarding integers and doubles seem quite unavoidable.
    The same can be said of the addition of booleans and chars, which have to
    be illegal.
    However, addition of booleans could be used to change between states, and
    any char addition with nothing other than Strings adds it's ANSI index to
    that value, when in most cases a String concatenation could occur. Most of
    booleans' entries are problematic, in that they cannot be successfully used.
*/

/*4.HERE’S A PUZZLER: NORMALLY, THE STATEMENT x++ IS EXACTLY EQUIVALENT TO
    x = x + 1. BUT IF x IS A CHAR, IT’S NOT EXACTLY THE SAME! IN THAT CASE,
    x++ IS LEGAL, BUT x = x + 1 CAUSES AN ERROR. TRY IT OUT AND SEE WHAT THE
    ERROR MESSAGE IS, THEN SEE IF YOU CAN FIGURE OUT WHAT IS GOING ON.

    The problem is that in the first case, we are changing the char to next
    index in the ANSI table.
    In the second case, an addition of two char indexes is attempted in order
    to return a new index, but it isn't possible to convert an integer to a
    char, so the operation cannot be completed.
*/

/*5.WHAT HAPPENS WHEN YOU ADD "" (THE EMPTY STRING) TO THE OTHER TYPES,
    FOR EXAMPLE, "" + 5?

    All values are converted to Strings.
*/

/*6.FOR EACH DATA TYPE, WHAT TYPES OF VALUES CAN YOU ASSIGN TO IT? FOR EXAMPLE,
    YOU CAN ASSIGN AN INT TO A DOUBLE BUT NOT VICE VERSA.

    boolean - boolean;
    char - char, int;
    int - char, int;
    double - char, int, double;
    String - boolean, char, int, double, String;
*/
}
