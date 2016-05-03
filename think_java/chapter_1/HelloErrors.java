//Exercise 1.3
  class HelloErrors {
//class Hello
  /*Main.java:1: error: '{' expected */

    public static void main(String[] args) {
  //public static void mian(String[] args) {
  //public void main(String[] args) {
  //static void main(String[] args) {
    /*spoj: The program compiled successfully, but
      main class was not found. Main class should contain
      method: public static void main (String[] args).*/

      System.out.println("Hello, world.");
    //.out.println("Hello, world.");
      /*Main.java:13: error: illegal start of expression */
    //System.out.Println("Hello, world.");
      /*Main.java:13: error: cannot find symbol
        symbol:   method Println(String)
        location: variable out of type PrintStream */
    //System.out.print("Hello, world.");
      /*output: Hello, world.How are you? */

      System.out.println("How are you?");
    //System.out.println"How are you?");
      /*Main.java:23: error: not a statement
        Main.java:23: error: ';' expected */
    //System.out.println("How are you?"));
      /*Main.java:30: error: ';' expected */
    }
  //
    /*Main.java:20: error: reached end of file while parsing */

  }
/*output: Hello, world.
          How are you? */
