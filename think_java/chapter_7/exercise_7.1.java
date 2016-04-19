/*1. DRAW A TABLE THAT SHOWS THE VALUE OF THE VARIABLES I AND N DURING THE EXECUTION OF LOOP. THE TABLE SHOULD CONTAIN ONE COLUMN FOR EACH VARIABLE AND ONE LINE FOR EACH ITERATION.

n   i
10  10
10  5
10  6
10  3
10  4
10  2
10  1
10  2
10  1
..  ..

2. WHAT IS THE OUTPUT OF THIS PROGRAM?

10
5
6
3
4
2
1
2
1
..

3. CAN YOU PROVE THAT THIS LOOP TERMINATES FOR ANY POSITIVE VALUE OF N?

No, there's no way for this loop to terminate for any positive value of N.

*/

class Main {
  public static void main(String[] args) {
    loop(10);
  }
  public static void loop(int n) {
    int i = n;
    while (i > 0) {
      System.out.println(i);
      if (i % 2 == 0) {
        i = i / 2;
      } else {
        i = i + 1;
      }
    }
  }
}
