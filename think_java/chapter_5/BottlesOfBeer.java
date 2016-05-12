//Exercise 5.5
class BottlesOfBeer {


  public static void main(String[] args) {

    bottles(99);

    System.out.println("1 bottle of beer on the wall");
    System.out.println("1 bottle of beer");
    System.out.println("ya' can't take one down, ya' can't pass it around,");
    System.out.println("No more bottles of beer on the wall.\n");
    System.out.println("No bottles of beer on the wall,");
    System.out.println("no bottles of beer,");
    System.out.println("ya' can't take one down, ya' can't pass it around,");
    System.out.println("'cause there are no more bottles of beer on the wall!");
  }


  public static void bottles(int n) {

    if (n > 1) {
      System.out.println(n + " bottles of beer on the wall");
      System.out.println(n + " bottles of beer");
      System.out.println("ya' take one down, ya' pass it around,");
      n = n - 1;

      if (n != 1) {
        System.out.println(n + " bottles of beer on the wall.\n");
        bottles(n);

      } else {
        System.out.println(n + " bottle of beer on the wall.\n");
      }
    }
  }
}
