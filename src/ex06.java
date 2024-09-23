import java.util.Scanner;

public class ex06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("요소 수: ");
    int size = scanner.nextInt();

    int[] array = new int[size];

    for (int i = 0; i < array.length; i++) {
      int random = (int) (Math.random() * 10) + 1;
      array[i] = random;
    }

    for (int i = 10; i > 0; i--) {
      for (int j = 0; j < array.length; j++) {
        if (array[j] >= i) {
          System.out.print("* ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(i % 10 + " ");
    }
    System.out.println();

  }
}
