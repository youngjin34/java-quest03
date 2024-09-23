public class ex04 {
  public static void main(String[] args) {
    int[][] matrix1 = {
        { 2, 3, 4 },
        { 3, 2, 1 }
    };

    int[][] matrix2 = {
        { 1, 2, 3 },
        { -4, -2, 1 }
    };

    int[][] sum = new int[2][3];

    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix1[i].length; j++) {
        sum[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }

    System.out.println("두 행렬의 합:");
    for (int i = 0; i < sum.length; i++) {
      for (int j = 0; j < sum[i].length; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }
  }
}
