import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("행 수: ");
    int rows = scanner.nextInt();

    int[] cols = new int[rows];

    for (int i = 0; i < rows; i++) {
      System.out.println(i + "번 째의 열 수: ");
      cols[i] = scanner.nextInt();
    }

    int[][] array = new int[rows][];

    System.out.println("각 요소의 값을 입력");
    for (int i = 0; i < rows; i++) {
      array[i] = new int[cols[i]];

      System.out.println("행 " + (i + 1) + "의 값을 입력하세요:");
      for (int j = 0; j < cols[i]; j++) {
        System.out.print("array[" + i + "][" + j + "]의 값을 입력하세요: ");
        array[i][j] = scanner.nextInt();
      }
    }

    System.out.println("배열 c의 각 요솟값은 다음고 같다.");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

  }
}
