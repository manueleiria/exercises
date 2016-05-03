//Exercise 4.3
class AmericanEuropeanDate {

  public static void printAmerican(String day, String month, int date, int year) {
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
  }

  public static void printEuropean(String day, int date, String month, int year) {
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + ", " + year);
  }

  public static void main(String[] args) {
    printAmerican("Friday", "March", 15, 2016);
    System.out.println();
    printEuropean("Friday", 15, "March", 2016);
  }

}
