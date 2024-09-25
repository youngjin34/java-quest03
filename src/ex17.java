import java.util.Scanner;

public class ex17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("요소 수: ");
    int num = scanner.nextInt();

    int[] a = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.print("a[" + i + "]: ");
      a[i] = scanner.nextInt();
    }

    System.out.print("찾을 숫자: ");
    int searchValue = scanner.nextInt();

    int firstIndex = -1;
    for (int i = 0; i < num; i++) {
      if (a[i] == searchValue) {
        firstIndex = i;
        break;
      }
    }

    int lastIndex = -1;
    for (int i = num - 1; i >= 0; i--) {
      if (a[i] == searchValue) {
        lastIndex = i;
        break;
      }
    }

    if (firstIndex != -1) {
      System.out.println("그 값은 a[" + firstIndex + "]에 있다.");
    } else {
      System.out.println("값 " + searchValue + "을 찾을 수 없습니다.");
    }

    if (lastIndex != -1) {
      System.out.println("가장 마지막 위치는 a[" + lastIndex + "]에 있다.");
    } else {
      System.out.println("값 " + searchValue + "을 찾을 수 없습니다.");
    }
  }
}
