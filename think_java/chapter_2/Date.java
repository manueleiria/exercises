//Exercise 2.2
class Date {

  public static void main(String[] args) {
    String day, month;
    int date, year;

    day =   "Friday";
    date =  15;
    month = "March";
    year =  2016;

    System.out.println(day);
    System.out.println(date);
    System.out.println(month);
    System.out.println(year);

    System.out.println();

    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + ", " + year);
  }
}
