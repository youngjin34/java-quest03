import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("학급 수: ");
    int classCount = scanner.nextInt();

    int totalSum = 0;
    int totalStudents = 0;

    for (int i = 1; i <= classCount; i++) {
      System.out.print(i + "반의 학생 수: ");
      int studentCount = scanner.nextInt();
      totalStudents += studentCount;
      int classSum = 0;

      for (int j = 1; j <= studentCount; j++) {
        System.out.print(i + "반 " + j + "번의 점수: ");
        int score = scanner.nextInt();
        classSum += score;
      }

      double classAverage = (double) classSum / studentCount;
      totalSum += classSum;

      System.out.printf("%d반: %d    %.1f\n", i, classSum, classAverage);
    }

    double totalAverage = (double) totalSum / totalStudents;

    System.out.printf("합: %d    %.1f\n", totalSum, totalAverage);
  }
}
