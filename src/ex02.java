public class ex02 {
  public static void main(String[] args) throws Exception {

    double[] scores = { 90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7 };

    double sum = 0;

    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }

    double average = sum / scores.length;

    System.out.printf("합계: %.1f\n", sum);
    System.out.printf("평균: %.1f", average);
  }
}
