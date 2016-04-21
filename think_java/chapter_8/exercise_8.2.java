class Main {
  //Method to calculate the product of the elements of the array.
  public static int banana(int[] a) {                                           //a     == array
    int kiwi = 1;                                                               //kiwi  == product
    int i = 0;                                                                  //i     == index
    while (i < a.length) {
      kiwi = kiwi * a[i];
      i++;
    }
    return kiwi;
  }
  //Method to search the array for a specific value, and return its index.
  public static int grapefruit(int[] a, int grape) {                            //a     == array; grape == search
    for (int i = 0; i < a.length; i++) {                                        //i     == index
      if (a[i] == grape) {
        return i;
      }
    }
    return -1;
  }
  //Method to count the amount of a specific value in the array.
  public static int pineapple(int[] a, int apple) {                             //a     == array; apple == search
    int pear = 0;                                                               //pear  == count
    for (int pine: a) {                                                         //pine  == index
      if (pine == apple) {
        pear++;
      }
    }
    return pear;
  }
}
