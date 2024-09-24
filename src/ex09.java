import java.util.Scanner;

public class ex09 {
  public static void main(String[] args) {
    int students = 6;
    int[][] scores = new int[students][2];

    inputScore(scores, students);

    average(scores, students);

    maxMin(scores, students);

  }

  public static void inputScore(int scores[][], int students) {

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < students; i++) {
      System.out.print((i + 1) + "번 ");
      System.out.print("국어: ");
      scores[i][0] = scanner.nextInt();
      System.out.print("    수학: ");
      scores[i][1] = scanner.nextInt();
    }
  }

  public static void average(int scores[][], int students) {
    double totalKorean = 0;
    double totalMath = 0;

    for (int i = 0; i < students; i++) {
      int koreanScore = scores[i][0];
      int mathScore = scores[i][1];
      double average = (koreanScore + mathScore) / 2.0;

      totalKorean += koreanScore;
      totalMath += mathScore;

      System.out.printf("%d번\t%d\t%d\t%.1f\n", (i + 1), koreanScore, mathScore, average);
    }

    double averageKorean = totalKorean / students;
    double averageMath = totalMath / students;

    System.out.printf("평균\t%.1f\t%.1f\n", averageKorean, averageMath);
    System.out.println();
  }

  public static void maxMin(int scores[][], int students) {
    int koreanMax = Integer.MIN_VALUE;
    int koreanMin = Integer.MAX_VALUE;
    int mathMax = Integer.MIN_VALUE;
    int mathMin = Integer.MAX_VALUE;

    for (int i = 0; i < students; i++) {
      int koreanScore = scores[i][0];
      int mathScore = scores[i][1];

      if (koreanScore > koreanMax) {
        koreanMax = koreanScore;
      }
      if (koreanScore < koreanMin) {
        koreanMin = koreanScore;
      }

      if (mathScore > mathMax) {
        mathMax = mathScore;
      }
      if (mathScore < mathMin) {
        mathMin = mathScore;
      }
    }

    System.out.printf("국어 최고 점수: %d\n국어 최저 점수: %d\n", koreanMax, koreanMin);
    System.out.printf("수학 최고 점수: %d\n수학 최저 점수: %d\n", mathMax, mathMin);

  }
}
