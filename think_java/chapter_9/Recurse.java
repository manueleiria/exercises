//Exercise 9.4
class Recurse{


  public static void main(String[] args) {
    printString("This is a string.");
    System.out.println();

    printBackward("This is a string.");
    System.out.println();

    System.out.println(reverseString("This is a string."));
    System.out.println();

    System.out.println(isPalindrome("saviivas"));
    System.out.println();

    System.out.println(first("First"));
    System.out.println(rest("Second"));
    System.out.println(middle("Third"));
    System.out.println(length("All"));

  }


  public static void printString(String s) {
    System.out.println(first(s));
    s = rest(s);
    if (length(s) > 0) {
      printString(s);
    }
  }


  public static void printBackward(String s) {
    if (length(s) > 1) {
      printBackward(rest(s));
    }
    System.out.println(first(s));
  }


  public static String reverseString(String s) {
    if (length(s) > 1) {
      s = reverseString(rest(s)) + first(s);
    }
    return s;
  }


  public static boolean isPalindrome(String s) {
    boolean isPalindrome = false;

    if (s.length() == 1) {
      isPalindrome = true;
    }

    if (s.length() == 2) {

      if (String.valueOf(first(s)).equals(rest(s))) {
        isPalindrome = true;
      }

    } else if (isPalindrome(middle(s))) {
      isPalindrome = true;
    }
    
    return isPalindrome;
  }

  /**
  * Returns the first character of the given String.
  */
  public static char first(String s) {
    return s.charAt(0);
  }

  /**
  * Returns all but the first letter of the given String.
  */
  public static String rest(String s) {
    return s.substring(1);
  }

  /**
  * Returns all but the first and last letter of the String.
  */
  public static String middle(String s) {
    return s.substring(1, s.length() - 1);
  }

  /**
  * Returns the length of the given String.
  */
  public static int length(String s) {
    return s.length();
  }
}
