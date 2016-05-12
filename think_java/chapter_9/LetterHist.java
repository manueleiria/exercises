//Exercise 9.2
class LetterHist {


  public static void main(String[] args) {
    int[] histogram = letterHist("The quick brown fox jumps over the lazy dog.");

    for (int i = 0; i < histogram.length; i++) {
      System.out.print(histogram[i] + "; ");
    }
  }


  private static int[] letterHist(String string) {
    int letterIndex;
    int[] letterHist = new int[26];

    string = string.toLowerCase().replaceAll("[ \\.\\,\\'\\;\\:]+", "");

    for (char letter: string.toCharArray()) {
      letterIndex = (int)letter-97;
      letterHist[letterIndex]++;
    }

    return letterHist;
  }
}
