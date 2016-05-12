//Exercise 9.3
class EncapGeneralize {


  public static void main(String[] args) {

    System.out.println(parenthesisDiff("((3 + 7) * 2)"));
    System.out.println(parenthesisDiff("((3)"));
  }

  private static int parenthesisDiff(String s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(') {
        count++;

      } else if (c == ')') {
        count--;
      }
    }

    return count;
  }
}
