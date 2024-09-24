import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rowsA = 4;
    int colsA = 3;
    int[][] matrixA = new int[rowsA][colsA];

    int rowsB = 3;
    int colsB = 4;
    int[][] matrixB = new int[rowsB][colsB];

    System.out.println("행렬 a의 요소");
    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsA; j++) {
        System.out.print("a[" + i + "][" + j + "]: ");
        matrixA[i][j] = scanner.nextInt();
      }
    }

    System.out.println("행렬 b의 요소");
    for (int i = 0; i < rowsB; i++) {
      for (int j = 0; j < colsB; j++) {
        System.out.print("b[" + i + "][" + j + "]: ");
        matrixB[i][j] = scanner.nextInt();
      }
    }

    int[][] resultMatrix = new int[rowsA][colsB];

    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsB; j++) {
        for (int k = 0; k < colsA; k++) {
          resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
        }
      }
    }

    System.out.println("행렬 a와 b의 곱");
    for (int i = 0; i < resultMatrix.length; i++) {
      for (int j = 0; j < resultMatrix[i].length; j++) {
        System.out.print(resultMatrix[i][j] + " ");
      }
      System.out.println(); // 줄바꿈
    }
  }
}
