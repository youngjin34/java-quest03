import java.util.Scanner;

public class ex05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("dnum 배열의 길이: ");
    int length = scanner.nextInt();

    double[] dnum = new double[length];

    for (int i = 0; i < dnum.length; i++) {
      System.out.print(dnum + " ");
    }

    System.out.println();

    for (int i = 0; i < dnum.length; i++) {
      System.out.print("dnum[" + i + "] 번째 데이터 입력: ");
      dnum[i] = scanner.nextDouble();
    }

    double sum = 0;
    for (int i = 0; i < dnum.length; i++) {
      sum += dnum[i];
    }

    double average = sum / length;

    System.out.println("배열의 합은 " + sum + "입니다.");
    System.out.println("배열의 평균은 " + average + "입니다.");
  }
}
