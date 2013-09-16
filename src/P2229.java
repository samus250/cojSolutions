import java.util.Scanner;

public class P2229 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    String b = scanner.nextLine();

    System.out.println(distance(a, b));
  }

  public static int distance(String a, String b) {
    int result = 0;
    int[][] table = new int[a.length() + 1][b.length() + 1];
    for (int i = 0; i < a.length(); i++) {
      table[i][0] = i;
    }
    for (int j = 0; j < b.length(); j++) {
      table[0][j] = j;
    }
    for (int i = 0; i < a.length(); i++) {
      for (int j = 0; j < b.length(); j++) {
        if (a.charAt(i) == b.charAt(j)) {
          table[i + 1][j + 1] = table[i][j];
        } else {
          // it is the min of the distances, either
          // substitution, deletion, insertion.
          table[i + 1][j + 1] = Math.min(Math.min(table[i + 1][j] + 1, table[i][j + 1] + 1),
              table[i][j] + 1);
        }
      }
    }
    return table[a.length()][b.length()];
  }
}
