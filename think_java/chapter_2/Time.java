//Exercise 2.3
class Time {


  public static void main(String[] args) {
    int hour, minute, second;
    int secondsDay, secondsNow, secondsRemaining, dayPercent;

    hour    = 18;
    minute  = 21;
    second  = 46;

    secondsDay = (hour * 60 + minute) * 60 + second;
    secondsRemaining = 24 * 60 * 60 - secondsDay;
    dayPercent = secondsDay * 100 / (24 * 60 * 60);

    hour    = 18;
    minute  = 57;
    second  = 23;

    secondsNow = (hour * 60 + minute) * 60 + second - secondsDay;

    System.out.println(secondsDay + " seconds have past since the day begun.");
    System.out.println(secondsRemaining + " seconds remain until the end of the day.");
    System.out.println(dayPercent + "% of the day has ellapsed.");
    System.out.println(secondsNow + " seconds have ellapsed since starting this exercise.");
  }
}
