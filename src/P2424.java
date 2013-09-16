import java.util.Scanner;

public class P2424 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cases = scanner.nextInt();
    for (int i = 0; i < cases; i++) {
      int numOfColors = scanner.nextInt();
      int maxColor = Integer.MIN_VALUE;
      for (int j = 0; j < numOfColors; j++) {
        int socksOfColorJ = scanner.nextInt();
        if (maxColor < socksOfColorJ) {
          maxColor = socksOfColorJ;
        }
      }
      System.out.println("Case " + (i + 1) + ": " + (numOfColors + 1) + " " + (maxColor + 1));
    }
  }

}
