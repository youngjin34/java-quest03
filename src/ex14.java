import java.util.Scanner;

public class ex14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("요소 수: ");
    int num = scanner.nextInt();

    int[] a = new int[num];
    int[] b = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.println("a[" + i + "]: ");
      a[i] = scanner.nextInt();
    }

    for (int i = 0; i < num; i++) {
      b[i] = a[num - 1 - i];
    }

    System.out.println("ㅁ의 모든 요소를 역순으로 복사");
    for (int j = 0; j < num; j++) {
      System.out.println("b[" + j + "]: " + b[j]);
    }
  }
}
