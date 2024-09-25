import java.util.Scanner;

public class ex15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("요소 수: ");
    int num = scanner.nextInt();

    int[] a = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.println("a[" + i + "]: ");
      a[i] = scanner.nextInt();
    }

    for (int i = 0; i < num; i++) {
      int random = (int) (Math.random() * num);
      int tmp = a[i];
      a[i] = a[random];
      a[random] = tmp;
    }

    System.out.println("배열을 무작위로 섞었다.");
    for (int j = 0; j < num; j++) {
      System.out.println("a[" + j + "]: " + a[j]);
    }
  }
}
