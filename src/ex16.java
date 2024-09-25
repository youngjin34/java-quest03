import java.util.Scanner;

public class ex16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("요소 수: ");
    int num = scanner.nextInt();

    int[] a = new int[num];

    for (int i = 0; i < num; i++) {
      a[i] = (int) (Math.random() * 10) + 1;
    }

    for (int j = 0; j < num; j++) {
      System.out.println("a[" + j + "]: " + a[j]);
    }
  }
}
