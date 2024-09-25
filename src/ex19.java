import java.util.Scanner;

public class ex19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("요소 수: ");
    int num = scanner.nextInt();

    int[] a = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.print("a[" + i + "]: ");
      a[i] = scanner.nextInt();
    }

    System.out.print("a = {");
    for (int i = 0; i < num; i++) {
      System.out.print(a[i]);
      if (i < num - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("}");

  }
}
