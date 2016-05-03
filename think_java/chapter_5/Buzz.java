//Exercise 5.6
/*
1. WRITE THE NUMBER 1 NEXT TO THE FIRST LINE OF CODE IN THIS PROGRAM THAT
WILL EXECUTE.

2. WRITE THE NUMBER 2 NEXT TO THE SECOND LINE OF CODE, AND SO ON UNTIL THE END OF THE PROGRAM. IF A LINE IS EXECUTED MORE THAN ONCE, IT MIGHT END UP WITH MORE THAN ONE NUMBER NEXT TO IT.

3. WHAT IS THE VALUE OF THE PARAMETER BLIMP WHEN BAFFLE GETS INVOKED?

"rattle"

4. WHAT IS THE OUTPUT OF THIS PROGRAM?

"ik"
"rattle"
"rattle zoop"
"boo-wa-ha-ha"
*/

class Buzz {
  public static void baffle(String blimp) {           //08
    System.out.println(blimp);                        //09
    zippo("ping", -5);                                //10
  }                                                   //16
  public static void zippo(String quince, int flag) { //03;11
    if (flag < 0) {                                   //04;12
      System.out.println(quince + " zoop");           //13
    } else {                                          //05
      System.out.println("ik");                       //06
      baffle(quince);                                 //07
      System.out.println("boo-wa-ha-ha");             //17
    }                                                 //14;18
  }                                                   //15;19
  public static void main(String[] args) {            //01
    zippo("rattle", 13);                              //02
  }                                                   //20
}                                                     //21
