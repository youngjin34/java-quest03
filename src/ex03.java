import java.util.Scanner;

public class ex03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] scores = new int[2][2];

    for (int i = 0; i < scores.length; i++) {
      System.out.println("학생번호 " + (i + 1));
      System.out.print("국어점수: ");
      scores[i][0] = scanner.nextInt();
      System.out.print("수학점수: ");
      scores[i][1] = scanner.nextInt();
    }

    for (int i = 0; i < scores.length; i++) {
      double average = (scores[i][0] + scores[i][1]) / 2.0;
      System.out.println("학생번호 " + (i + 1));
      System.out.println("국어: " + scores[i][0] + " 수학: " + scores[i][1] + " 평균: " + average);
    }
  }
}
