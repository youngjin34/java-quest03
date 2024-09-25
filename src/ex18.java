import java.util.Scanner;

public class ex18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("사람 수: ");
    int num = scanner.nextInt();

    int[] a = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.print(i + "번의 점수: ");
      a[i] = scanner.nextInt();
    }

    int sum = 0;
    double average;
    int maxScore = Integer.MIN_VALUE;
    int minScore = Integer.MAX_VALUE;

    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    average = sum / num;

    for (int i = 0; i < a.length; i++) {
      if (maxScore < a[i]) {
        maxScore = a[i];
      }

      if (minScore > a[i]) {
        minScore = a[i];
      }
    }

    System.out.println("합계는 " + sum);
    System.out.println("평균은 " + average);
    System.out.println("최고점은 " + maxScore);
    System.out.println("최저점은 " + minScore);

  }
}
