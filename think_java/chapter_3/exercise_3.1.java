/*Draw a stack frame that shows the state of the program in
  Section 3.10 when main invokes printTime with the arguments 11 and 59.*/

class Main3 {

  public static void printTime(int hour, int minute) {
    System.out.print(hour);
    System.out.print(":");
    System.out.println(minute);
  }

  public static void main(String[] args) {
    printTime(11, 59);
  }
}

/*main      |argument|11||
  printTime |    hour|11||

  main      |argument|59||
  printTime |  minute|59||*/
